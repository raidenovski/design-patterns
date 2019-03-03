package com.urosht.demo;

/**
 * A concrete command implementation
 */
public class SaveTextFileOperation implements TextFileCommand {

    private TextFile textFile;

    public SaveTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.save();
    }
}
