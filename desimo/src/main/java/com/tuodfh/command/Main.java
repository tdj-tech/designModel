package com.tuodfh.command;

/**
 * @author tdj
 * 2022/4/25 0025
 * @desc
 */
public class Main {

    public static void main(String[] args) {
        StringCommand stringCommand = new StringCommand(new Content("content:"));
        stringCommand.doit();
        stringCommand.undo();
    }

}
