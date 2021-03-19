package com.athome.command;

/**
 * @Author zhangxw03
 * @Dat 2021-03-19 10:06
 * @Describe 请求方
 */
public class Button {

    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void print() {
        command.execute("AAAAAAAAABBBBB");
    }

    public void undo() {
        command.undo();
    }

    public static void main(String[] args) {
        Button button = new Button(new PrintCommand());
        button.print();
        button.undo();
    }
}
