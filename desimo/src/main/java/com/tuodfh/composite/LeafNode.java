package com.tuodfh.composite;

/**
 * @author tdj
 * 2022/4/18 0018
 * 叶子节点
 */
public class LeafNode extends Node {

    private String content;

    public LeafNode() {
    }

    public LeafNode(String content) {
        this.content = content;
    }

    @Override
    void printName() {
        System.out.println(content);
    }
}
