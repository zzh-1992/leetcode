package com.grapefruit.tree;

public class TreeNode {
    TreeNode left;
    TreeNode right;
    int value;

    public TreeNode(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value + " ";
    }
}
