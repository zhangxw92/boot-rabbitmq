package com.athome.command;

/**
 * @Author zhangxw03
 * @Dat 2021-03-19 10:13
 * @Describe
 */
public class PrintCommand implements Command {

    private PrintService printService = new PrintService();

    public PrintCommand() {
    }

    @Override
    public void execute(String message) {
        printService.print(message);
    }

    @Override
    public void undo() {
        printService.undo();
    }
}
