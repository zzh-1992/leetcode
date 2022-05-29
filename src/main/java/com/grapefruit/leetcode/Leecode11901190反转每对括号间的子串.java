package com.grapefruit.leetcode;

public class Leecode11901190反转每对括号间的子串 {
    public static void main(String[] args) {
        reverseParentheses("a(bcdefghijkl(mno)p)q");
    }

    public static void reverseParentheses(String s) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            }
            if (s.charAt(i) == ')') {
                right++;
            }
        }
        // 确保括号成对出现
        if (left == right) {
            System.out.println(replaceString(s));
        }
    }

    public static String replaceString(String str) {
        if (!str.contains("(") || !str.contains(")")) {
            return str;
        }
        int rightIndex = 0;
        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                if (k == 0) {
                    rightIndex = i;
                    ++k;
                }
                if (k == 1) {
                    k = 0;
                }
            }
            if (str.charAt(i) == ')') {
                String tmp = str.substring(rightIndex , i + 1);
                str = str.replace(tmp, re(tmp));
                break;
            }
        }
        return replaceString(str);
    }

    public static String re(String s) {
        return new StringBuffer(s.replace("(", "").replace(")", "")).reverse().toString();
    }
}
