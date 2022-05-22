/*
 *Copyright @2021 Grapefruit. All rights reserved.
 */

package com.grapefruit.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * LongestPalindromicSubstring
 *
 * @author zhihuangzhang
 * @version 1.0
 * @date 2021-10-21 6:54 下午
 */
public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        String s = "apple";
        long begin = System.currentTimeMillis();
        System.out.println(longestPalindrome(s));
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }

    public static String longestPalindrome(String source) {

        // 获取所有字串
        // 字串返回与原有比较
        if (source.length() == 1) {
            return source;
        }

        String reverse = new StringBuffer(source).reverse().toString();
        char[] s = source.toCharArray();
        char[] t = reverse.toCharArray();
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < source.length(); i++) {
            if (s[i] == t[i]) {
                list.add(s[i]);
            } else {
                list = new ArrayList<>();
            }
        }
        list.forEach(System.out::print);

        return "";

        /*for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length() + 1; j++) {
                String tmp = s.substring(i, j);

                String reverse = new StringBuffer(tmp).reverse().toString();
                // 判断两个数组是否相同
                if (tmp.equals(reverse)) {
                    container.add(tmp);
                }
            }
        }
        // 获取长度最长的字串
        Optional<String> first = container.stream().max(Comparator.comparing(String::length));
        return first.get();*/
    }
}
