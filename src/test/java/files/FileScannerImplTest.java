package files;

import files.read.FileScannerImpl;
import files.read.FileScannerResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class FileScannerImplTest {

    @Test
    void search() throws IOException {
        FileScannerImpl fileScanner = new FileScannerImpl();
        FileScannerResult fileScannerResultExpected = new FileScannerResult();

        String path = "src/main/java/files/httpd-full.log";
        String searchedIdentifier = "Googlebot";

        fileScannerResultExpected.setNoOfSearchedIdentifier(6);
        fileScannerResultExpected.setNoOfLines(117);
        fileScannerResultExpected.setCharacters(18348);

        FileScannerResult fileScannerResultActual = fileScanner.search(path, searchedIdentifier, true);

        Assertions.assertEquals(fileScannerResultExpected.getNoOfSearchedIdentifier(), fileScannerResultActual.getNoOfSearchedIdentifier());
        Assertions.assertEquals(fileScannerResultExpected.getNoOfLines(), fileScannerResultActual.getNoOfLines());
        Assertions.assertEquals(fileScannerResultExpected.getCharacters(), fileScannerResultActual.getCharacters());

    }

}