package com.urosht.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * The invoker class. Knows how to execute the given command but doesn't know anything about it's
 * implementation. It only knows the command's interface
 */
public class TextFileOperationExecutor {

    private final List<TextFileCommand> commands = new ArrayList<>();

    public String executeCommand(TextFileCommand textFileCommand) {
        commands.add(textFileCommand);
        return textFileCommand.execute();
    }

}
