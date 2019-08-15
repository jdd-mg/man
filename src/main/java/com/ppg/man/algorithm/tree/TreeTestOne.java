package com.ppg.man.algorithm.tree;

public class TreeTestOne {


    public int nodeNum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return nodeNum(root.getRight()) + nodeNum(root.getLeft()) + 1;
    }

    public int cNum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.getRight() == null && root.getLeft() == null) {
            return 1;
        }
        int i = cNum(root.getLeft());
        int i1 = cNum(root.getRight());
        int max = i > i1 ? i : i1;
        return max + 1;
    }

    public void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.getData());
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    public void midOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        preOrder(root.getLeft());
        System.out.println(root.getData());
        preOrder(root.getRight());
    }

    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        preOrder(root.getLeft());
        preOrder(root.getRight());
        System.out.println(root.getData());
    }

    public void levelOrder(TreeNode root) {

    }

    /**
     * k层有多少个节点
     *
     * @param node
     * @param k
     * @return
     */
    public int klevelNum(TreeNode node, int k) {
        if (node == null) {
            return 0;
        }

        if (k <= 0) {
            return 0;
        }

        if (k == 1) {
            return 1;
        }

        return klevelNum(node.getLeft(), k - 1) + klevelNum(node.getRight(), k - 1);
    }

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
}
