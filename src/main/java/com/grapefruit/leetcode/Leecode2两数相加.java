package com.grapefruit.leetcode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Leecode2两数相加 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l11 = new ListNode(4);
        ListNode l12 = new ListNode(9);
        l1.next = l11;
        l11.next = l12;

        ListNode l2 = new ListNode(5);
        ListNode l21 = new ListNode(6);
        ListNode l22 = new ListNode(4);
        ListNode l23 = new ListNode(9);
        l2.next = l21;
        l21.next = l22;
        l22.next = l23;

        ListNode node = new Leecode2两数相加().addTwoNumbers(l1, l2);
        System.out.println();
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigDecimal long1 = new BigDecimal(new StringBuffer(reverse(l1, "")).reverse().toString());
        BigDecimal long2 = new BigDecimal(new StringBuffer(reverse(l2, "")).reverse().toString());
        BigDecimal l = long1.add(long2);
        String[] last = l.toString().split("");
        List<ListNode> list = new ArrayList<>(last.length);
        for (String s : last) {
            ListNode tmp = new ListNode(Integer.parseInt(s));
            list.add(tmp);
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            if (i - 1 >= 0) {
                list.get(i).next = list.get(i - 1);
            }
        }
        return list.get(list.size()-1);
    }

    public String reverse(ListNode node, String str) {
        if (node.next != null) {
            return reverse(node.next, str) + node.val;
        }
        return str + node.val;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
