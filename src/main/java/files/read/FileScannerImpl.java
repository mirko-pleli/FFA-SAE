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
     * Method which search in a file for an given word.
     *
     * @param path The location of your file
     * @param search Your search parameter
     * @param writeSearchResults To save lines in a written file.
     * @return FileScannerResult with information about number of lines, characters and your searched parameter.
     * @throws IOException
     */
    @Override
    public FileScannerResult search(final String path, final String search, final boolean writeSearchResults) throws
            IOException {
        LOG.debug("--> search() path={}, search={}", path, search);
        int noOfLines = 0, noOfCharacters = 0, noOfSearchedIdentifier = 0;
        ArrayList<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (isSearchedIdentifier(line, search)) {
                    noOfSearchedIdentifier++;
                        lines.add(line + "\r\n");
                }
                noOfCharacters += line.length();
                noOfLines++;
            }
        }
        LOG.debug("<-- search() path={}, search={}", path, search);
        FileScannerResult scannerResult = fileScannerResult(noOfLines, noOfCharacters, noOfSearchedIdentifier);
        if (writeSearchResults) {
            writeSearchResults(search, lines, scannerResult);
        }
        return scannerResult;
    }

    private static boolean isSearchedIdentifier(final String line, final String search) {
        if (line.contains(search)) {
            return true;
        }
        return false;
    }

    private static FileScannerResult fileScannerResult(final int noOfLines, final int noOfCharacters,
                                                       final int noOfSearchedIdentifier) {
        FileScannerResult fileScannerResult = new FileScannerResult(noOfLines, noOfCharacters, noOfSearchedIdentifier);
        return fileScannerResult;
    }

    private static void writeSearchResults(final String search, final ArrayList<String> lines,
                                           final FileScannerResult scannerResult) {
        MyFileWriterImpl writer = new MyFileWriterImpl();
        writer.write(search, lines, scannerResult);
    }
}
