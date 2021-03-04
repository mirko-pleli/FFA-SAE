package files.read;

import java.io.IOException;

public interface FileScanner {
    FileScannerResult search(final String path, final String search, final boolean fileData) throws IOException;

    FileScannerResult search(final String path, final String search, final boolean fileData, boolean writeResult)
            throws IOException;
}
