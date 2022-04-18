package com.tuodfh.composite;

import java.util.List;

/**
 * @author tdj
 * 2022/4/18 0018
 * 组合模式，专用于树状结构
 */
public class Main {

    public static void main(String[] args) {
        BranchNode root = new BranchNode("root");
        BranchNode chapter1 = new BranchNode("chapter1");
        BranchNode chapter2 = new BranchNode("chapter2");
        LeafNode c11 = new LeafNode("c11");
        LeafNode c12 = new LeafNode("c12");
        BranchNode section2 = new BranchNode("section2");
        LeafNode s1 = new LeafNode("s1");
        LeafNode s2 = new LeafNode("s2");
        root.addNode(chapter1);
        root.addNode(chapter2);
        chapter1.addNode(c11);
        chapter1.addNode(c12);
        chapter2.addNode(section2);
        section2.addNode(s1);
        section2.addNode(s2);
        prinTree(root, 0);
    }

    public static void prinTree(Node root, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("--");
        }
        root.printName();
        if (root instanceof BranchNode) {
            List<Node> nodes = ((BranchNode) root).nodes;
            for (Node node : nodes) {
                prinTree(node, depth+1);
            }
        }
    }

}
