package files.read;

import files.write.MyFileWriterImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileScannerImpl implements FileScanner {

    private static final Logger LOG = LoggerFactory.getLogger(FileScannerImpl.class);

    /**
     * @param path
     * @param fileData
     * @param search
     * @return How many times the word to search was found, and the actual file length with characters.
     */
    @Override
    public FileScannerResult search(final String path, final String search, final boolean fileData)
            throws IOException {
        LOG.debug("--> search() path={}", path);
        int noOfLines = 0, characters = 0, noOfSearchedIdentifier = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (isSearchedIdentifier(line, search)) {
                    noOfSearchedIdentifier++;
                }
                characters += line.length();
                noOfLines++;
            }
        }
        LOG.debug("<-- search() path={}", path);
        return fileScannerResult(fileData, noOfLines, characters, noOfSearchedIdentifier);
    }

    /**
     * Create a file which contain the founded search line.
     *
     * @param path
     * @param search
     * @param fileData
     * @param writeSearch
     * @return How many times the word to search was found, and the actual file length with characters.
     * @throws IOException
     */
    @Override
    public FileScannerResult search(String path, String search, boolean fileData, boolean writeSearch) throws IOException {
        LOG.debug("--> search() path={}", path);
        int noOfLines = 0, characters = 0, noOfSearchedIdentifier = 0;
        ArrayList<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (isSearchedIdentifier(line, search)) {
                    noOfSearchedIdentifier++;
                    if (writeSearch) {
                        lines.add(line + "\r\n");
                    }
                }
                characters += line.length();
                noOfLines++;
            }
        }
        LOG.debug("<-- search() path={}", path);
        FileScannerResult scannerResult = fileScannerResult(fileData, noOfLines, characters, noOfSearchedIdentifier);
        writeResult(search, lines, scannerResult);
        return scannerResult;
    }

    private static boolean isSearchedIdentifier(final String line, final String search) {
        if (line.contains(search)) {
            return true;
        }
        return false;
    }

    private static FileScannerResult fileScannerResult(final boolean isFileDataNeeded, final int noOfLines, final int characters,
                                                       final int noOfSearchedIdentifier) {
        FileScannerResult fileScannerResult = new FileScannerResult();
        if (isFileDataNeeded) {
            fileScannerResult.setNoOfLines(noOfLines);
            fileScannerResult.setCharacters(characters);
        }
        fileScannerResult.setNoOfSearchedIdentifier(noOfSearchedIdentifier);
        return fileScannerResult;
    }

    private static void writeResult(final String search, ArrayList<String> lines, final FileScannerResult scannerResult) {
        MyFileWriterImpl writer = new MyFileWriterImpl();
        writer.write(search, lines, scannerResult);
    }
}
