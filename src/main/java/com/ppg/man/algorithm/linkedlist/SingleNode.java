package com.ppg.man.algorithm.linkedlist;

import lombok.Data;

@Data
public class SingleNode {
    public int data;
    private SingleNode next;

    public SingleNode(int data) {
        this.data = data;
    }

    public static SingleNode createNode() {
        //创建一个 单向链表  用于模拟数据
        SingleNode node1 = new SingleNode(1);
        SingleNode node2 = new SingleNode(2);
        SingleNode node3 = new SingleNode(3);
        SingleNode node4 = new SingleNode(4);
        SingleNode node5 = new SingleNode(5);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        return node1;
    }

    public static void main(String[] args) {
        SingleNode node = createNode();

        SingleNode revert = revert(node);

        System.out.println(revert);

    }

    public static SingleNode revert(SingleNode node) {

        if (node == null) {
            return node;
        }

        SingleNode pre = node;
        SingleNode cur = node.getNext();
        SingleNode temp;
        while (cur != null) {
            temp = cur.getNext();
            cur.setNext(pre);

            pre = cur;
            cur = temp;
        }

        node.setNext(null);

        return pre;
    }
}
