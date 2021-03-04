package files.write;

import files.read.FileScannerImpl;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class MyFileWriterImplTest {

    @Test
    void search() throws IOException {
        FileScannerImpl fileScanner = new FileScannerImpl();
        String path = "src/main/java/files/read/httpd-full.log";
        String searchedIdentifier = "Googlebot";

        fileScanner.search(path, searchedIdentifier, true, true);
    }
}