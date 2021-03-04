package files.read;

import java.io.Serializable;

public class FileScannerResult implements Serializable {

    private int noOfLines;

    private int characters;

    private int noOfSearchedIdentifier;

    public int getNoOfLines() {
        return noOfLines;
    }

    public void setNoOfLines(int noOfLines) {
        this.noOfLines = noOfLines;
    }

    public int getCharacters() {
        return characters;
    }

    public void setCharacters(int characters) {
        this.characters = characters;
    }

    public int getNoOfSearchedIdentifier() {
        return noOfSearchedIdentifier;
    }

    public void setNoOfSearchedIdentifier(int noOfSearchedIdentifier) {
        this.noOfSearchedIdentifier = noOfSearchedIdentifier;
    }
}
