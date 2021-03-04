package files.read;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class FileScannerImplTest {

    @Test
    void search() throws IOException {
        FileScannerImpl fileScanner = new FileScannerImpl();
        FileScannerResult expected = new FileScannerResult(117, 18348, 6);

        final String path = "src/main/java/files/read/httpd-full.log";
        final String searchedIdentifier = "Googlebot";
        FileScannerResult actual = fileScanner.search(path, searchedIdentifier, false);

        Assertions.assertEquals(expected.getNoOfSearchedIdentifier(), actual.getNoOfSearchedIdentifier());
        Assertions.assertEquals(expected.getNoOfLines(), actual.getNoOfLines());
        Assertions.assertEquals(expected.getCharacters(), actual.getCharacters());
    }
}