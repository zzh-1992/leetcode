/*
 *Copyright @2021 Grapefruit. All rights reserved.
 */

package com.grapefruit.tree;

/**
 * 二叉树 遍历
 *
 * @author zhihuangzhang
 * @version 1.0
 * @date 2022-06-02 19:32
 */
public class BinaryTreeTraversal {

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);

        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        n3.left = n6;
        n3.right = n7;

        print(n1);
    }

    /**
     * 先序遍历
     *  根左右 也叫做先根遍历、前序遍历，可记做 （二叉树父结点向下先左后右）。
     * 首先访问根结点然后遍历左子树，最后遍历右子树。在遍历左、右子树时，仍然先访问根结点，然后遍历左子树，最后遍历右子树，如果二叉树为空则返回。
     *
     * 中序遍历
     *  左根右 首先遍历左子树，然后访问根结点，最后遍历右子树
     *
     * 后序遍历
     *  左右根 首先遍历左子树，然后遍历右子树，最后访问根结点
     *
     * 先后都是相对于"根"而已
     */

    private static void print(TreeNode n) {
        // 先序
        // System.out.print(n.value + " ");
        if (n.left != null) {
            print(n.left);
        }
        // 中序
        // System.out.print(n.value + " ");
        if (n.right != null) {
            print(n.right);
        }
        // 后续
        //System.out.print(n.value + " ");
    }
}

class TreeNode {
    TreeNode left;
    TreeNode right;
    int value;

    public TreeNode(int value) {
        this.value = value;
    }
}
