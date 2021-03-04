package files.read;

import java.io.IOException;

public interface FileScanner {
    FileScannerResult search(String path, String search, boolean fileData) throws IOException;
}
