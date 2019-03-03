package com.urosht.demo;

public class TextFileCommandApplication {

    public static void main(String[] args) {
        TextFileOperationExecutor textFileOperationExecutor
            = new TextFileOperationExecutor();
        String result1 = textFileOperationExecutor.executeCommand(
            new OpenTextFileOperation(new TextFile("file1.txt")));
        String result2 = textFileOperationExecutor.executeCommand(
            new SaveTextFileOperation(new TextFile("file2.txt")));

        System.out.println(result1);
        System.out.println(result2);
    }
}
