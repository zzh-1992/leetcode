/*
 *Copyright @2021 Grapefruit. All rights reserved.
 */

package com.grapefruit.linkerlist;

/**
 * 逆序打印单链表
 *
 * @author zhihuangzhang
 * @version 1.0
 * @date 2022-05-27 21:45
 */
public class 逆序打印单链表 {
    public static void main(String[] args) {
        // 准备单链表
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        n4.next = n5;
        n3.next = n4;
        n2.next = n3;
        n1.next = n2;

        // 逆序输出 5->1
        reverse(n1);
    }

    /**
     * 采用压栈的方式逆序输出节点的值
     *
     * @param node node
     */
    public static void reverse(Node node) {
        if (node.next == null) {
            System.out.println(node.value);
        } else {
            reverse(node.next);
            System.out.println(node.value);
        }
    }
}

/**
 * 节点node
 */

