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
public class Leecode3无重复字符的最长子串 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String str = s.nextLine();

            if(str.length() == 0){
                System.out.println(0);
            }
            if(" ".equals(str) || str.length() == 1){
                System.out.println(1);
            }
            int max = 0;
            // 获取所以字串
            for (int i = 0; i < str.length(); i++) {
                for (int j = i + 1; j <= str.length(); j++) {
                    String sub = str.substring(i, j);
                    if (isNeed(sub)) {
                        max = Math.max(max, sub.length());
                    }
                }
            }
            System.out.println(max + " ");
        }
    }

    public static boolean isNeed(String str) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        return true;
    }

}
