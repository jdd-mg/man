package com.ppg.man.algorithm.tree;

public class TreeMain {

    public static int nodeCount(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return nodeCount(root.getLeft()) + nodeCount(root.getRight()) + 1;
    }

    public static int leafCount(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.getLeft() == null && root.getRight() == null) {
            return 1;
        }

        return leafCount(root.getLeft()) + leafCount(root.getRight());
    }
}
