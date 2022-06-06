/*
 *Copyright @2021 Grapefruit. All rights reserved.
 */

package com.grapefruit.linkerlist;

/**
 * 判读链表是否有环(获取第一个入环的节点)
 *
 * @author zhihuangzhang
 * @version 1.0
 * @date 2022-06-06 18:31
 */
public class 判读链表是否有环 {

    public static void main(String[] args) {
        // 准备单链表
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n4;

        // 获取入环到第一个节点
        Node node = getNode(n1);
        System.out.println(node != null ? node.getValue() : "无环");
    }

    public static Node getNode(Node headNode) {
        // 定义快指针
        Node fast;
        // 定义慢指针
        Node slow;

        // 当节点的一个next节点和next.next节点为空时,说明链表无环
        if (headNode.next == null || headNode.next.next == null) {
            return null;
        }

        // 快指针走2步
        fast = headNode.next.next;

        // 慢指针走1步
        slow = headNode.next;

        while (true) {
            if (slow.next == null || fast.next == null || fast.next.next == null) {
                return null;
            }
            if (fast == slow) {
                // 当快指针与慢指针重合时,快慢指针在环内相遇,快指针重置到头节点
                fast = headNode;
                break;
            }
            // 快指针继续走2步
            fast = fast.next.next;
            // 慢指针继续走1步
            slow = slow.next;
        }
        while (true) {
            // 当快慢指针再次重合时,这个节点就是入环的第一个节点
            if (slow == fast) {
                return slow;
            }
            // 快指针重置到头节点时,快慢指针同时同时走一步
            fast = fast.next;
            slow = slow.next;
        }
    }
}
