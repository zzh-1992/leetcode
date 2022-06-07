/*
 *Copyright @2021 Grapefruit. All rights reserved.
 */

package com.grapefruit.tree;

import java.util.LinkedList;

/**
 * 宽度优先遍历
 *
 * @author zhihuangzhang
 * @version 1.0
 * @date 2022-06-05 15:15
 */
public class Tree宽度优先遍历 {

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);
        TreeNode n9 = new TreeNode(9);

        n1.left = n2;
        n1.right = n3;
        n2.right = n4;
        n3.left = n5;
        n4.left = n6;
        n4.right = n7;
        n5.left = n8;
        n5.right = n9;

        // 创建队列
        LinkedList<TreeNode> queue = new LinkedList<>();

        // 入队列
        queue.add(n1);

        while (!queue.isEmpty()) {
            // 弹出一个节点便把这个节点的左右节点押入队列
            TreeNode poll = queue.poll();

            if (poll != null) {
                System.out.print(poll);

                // 押入左右节点
                queue.add(poll.left);
                queue.add(poll.right);
            }
        }
    }
}
