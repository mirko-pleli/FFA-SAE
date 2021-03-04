package files.write;

import files.read.FileScannerResult;

import java.util.ArrayList;

public interface MyFileWriter {
    void write(final String fileName, ArrayList<String> lines, final FileScannerResult fileScannerResult);
}
