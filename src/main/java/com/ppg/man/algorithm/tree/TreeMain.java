package com.ppg.man.algorithm.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    //遍历二叉树中节点的数据

    /**
     * 遍历分为 前中后 序 遍历
     * <p>
     * 分别对应根节点的  前中后
     * <p>
     * 前：根 左 右
     * 中：左 根 右
     * 后：左 右 根
     *
     * @param root
     */
    public static void printV1(TreeNode root) {
        if (root != null) {
            System.out.println(root.getData()); // 前
            printV1(root.getLeft());
//            System.out.println(root.getData()); //中
            printV1(root.getRight());
//            System.out.println(root.getData());  后
        }
    }

    /**
     * 二叉树遍历
     * <p>
     * 按层次遍历， 由上往下，由左往右
     */
    public static void printV2(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<TreeNode> list = new ArrayList<>();
            while (!queue.isEmpty()) {
                list.add(queue.poll());
            }

            for (TreeNode node : list) {
                System.out.println(node.getData());
                if (node.getRight() != null) {
                    queue.add(node.getLeft());
                }

                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
            }
        }
    }

}
