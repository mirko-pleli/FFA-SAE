package files.read;

import java.io.IOException;

public interface FileScanner {
    FileScannerResult search(final String path, final String search, final boolean writeSearchResults) throws IOException;
}
