package files.write;

import files.read.FileScannerResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MyFileWriterImpl implements MyFileWriter {

    private static final Logger LOG = LoggerFactory.getLogger(MyFileWriterImpl.class);

    @Override
    public void write(final String fileName, ArrayList<String> lines, FileScannerResult scannerResult) {
        LOG.debug("--> write() fileName={}", fileName);
        try {
            FileWriter writer = new FileWriter("httpd-full_" + fileName + ".txt");
            for (String line : lines) {
                writer.write(line);
            }
            writer.write(scannerResult.getNoOfSearchedIdentifier());
            writer.write(scannerResult.getNoOfLines());
            writer.close();
        } catch (IOException e) {
            LOG.error("--> write() IOException={}", e);
        }
        LOG.debug("<-- write() fileName={}", fileName);
    }
}
