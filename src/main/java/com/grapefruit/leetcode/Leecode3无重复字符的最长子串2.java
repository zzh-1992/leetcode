/*
 *Copyright @2021 Grapefruit. All rights reserved.
 */

package com.grapefruit.leetcode;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 相关描述
 *
 * @author zhihuangzhang
 * @version 1.0
 * @date 2022-05-29 13:00
 */
public class Leecode3无重复字符的最长子串2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String str = s.nextLine();

            if (str.length() == 0) {
                System.out.println(0);
            }
            if (" ".equals(str) || str.length() == 1) {
                System.out.println(1);
            }

            System.out.println(getSub(0, str, 0));
        }
    }

    public static int getSub(int left, String str, int max) {
        if (left == str.length() - 1) {
            return max;
        }

        HashSet<Character> set = new HashSet<>();
        for (int right = left; right < str.length(); right++) {
            char c = str.charAt(right);
            if (set.contains(c)) {
                // 获取当前字串
                String sub = str.substring(left, right);
                // 取字串长度的最大值
                max = Math.max(max, sub.length());

                // 左侧开始位置重置
                left = right - sub.length() + 1;

                // 当这个字符是最后一个字符时,返回当前最大值
                if (right == str.length() - 1) {
                    return max;
                }
                break;
            } else {
                set.add(c);
            }
        }

        // 字串不包含任何重复字符
        if (str.length() - left == set.size()) {
            return set.size();
        }

        // 再查剩下的子串
        return  Math.max(max, getSub(left, str, max));
    }
}
