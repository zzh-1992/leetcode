/*
 *Copyright @2021 Grapefruit. All rights reserved.
 */

package com.grapefruit.linkerlist;

/**
 * node节点
 *
 * @author zhihuangzhang
 * @version 1.0
 * @date 2022-05-27 21:45
 */
public class Node {
    /**
     * 当前节点的数值
     */
    int value;
    /**
     * 下一个节点
     */
    Node next;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
