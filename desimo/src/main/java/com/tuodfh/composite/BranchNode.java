package com.tuodfh.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tdj
 * 2022/4/18 0018
 * 枝干节点
 */
public class BranchNode extends Node {

    List<Node> nodes = new ArrayList<>();

    private String name;

    public BranchNode() {
    }

    public BranchNode(String name) {
        this.name = name;
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    @Override
    void printName() {
        System.out.println(name);
    }
}
