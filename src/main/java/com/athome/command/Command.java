package com.athome.command;

/**
 * @Author zhangxw03
 * @Dat 2021-03-19 10:12
 * @Describe
 */
public interface Command {

    void execute(String message);

    void undo();
}
