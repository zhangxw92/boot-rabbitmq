package com.athome.command;

/**
 * @Author zhangxw03
 * @Dat 2021-03-19 10:07
 * @Describe 具体的执行者；
 */
public class PrintService {

    /**
     * 会被多处调用
     */
    public void print(String message) {
        System.out.println("打印：" + message);
    }

    public void undo() {
        System.out.println("撤销操作");
    }
}
