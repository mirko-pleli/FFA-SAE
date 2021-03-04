package files.read;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileScannerImpl implements FileScanner {

    private static final Logger LOG = LoggerFactory.getLogger(FileScannerImpl.class);

    /**
     * @param path
     * @param fileData
     * @param search
     * @return How many times the word to search was found, and the actual file length.
     */
    @Override
    public FileScannerResult search(String path, String search, boolean fileData) throws IOException {
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

    private static boolean isSearchedIdentifier(String line, String search) {
        if (line.contains(search)) {
            return true;
        }
        return false;
    }

    private static FileScannerResult fileScannerResult(boolean isFileDataNeeded, int noOfLines, int characters,
                                                       int noOfSearchedIdentifier) {
        FileScannerResult fileScannerResult = new FileScannerResult();
        if (isFileDataNeeded) {
            fileScannerResult.setNoOfLines(noOfLines);
            fileScannerResult.setCharacters(characters);
        }
        fileScannerResult.setNoOfSearchedIdentifier(noOfSearchedIdentifier);
        return fileScannerResult;
    }
}
