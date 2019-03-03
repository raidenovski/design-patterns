package com.urosht.demo;

/**
 * A concrete command implementation
 */
public class OpenTextFileOperation implements TextFileCommand {

    private TextFile textFile;

    public OpenTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.open();
    }
}
