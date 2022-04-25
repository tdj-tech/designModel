package com.tuodfh.command;

/**
 * @author tdj
 * 2022/4/25 0025
 * @desc
 */
public class StringCommand extends AbstractCommand {

    Content content;

    String msg = "i am a command.";

    public StringCommand() {
    }

    public StringCommand(Content content) {
        this.content = content;
    }

    @Override
    void doit() {
        content.setMsg(content.getMsg() + msg);
        System.out.println(content.getMsg());
    }

    @Override
    void undo() {
        String s = content.getMsg();
        content.setMsg(s.substring(0, s.length() - msg.length()));
        System.out.println(content.getMsg());
    }
}
