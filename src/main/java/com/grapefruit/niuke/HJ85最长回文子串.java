/*
 *Copyright @2021 Grapefruit. All rights reserved.
 */

package com.grapefruit.niuke;

import java.util.Scanner;

/**
 * 相关描述
 *
 * @author zhihuangzhang
 * @version 1.0
 * @date 2022-05-22 14:00
 */
public class HJ85最长回文子串 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int max = 0;
        for (int i = 0; i <= str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                // 获取字串
                String sub = str.substring(i, j);
                if (isRe(sub)) {
                    max = Math.max(sub.length(), max);
                }
                //System.out.println("sub:" + sub + " " + isRe(sub));
            }
        }
        System.out.println(max);
    }

    public static boolean isRe(String sub) {
        if (sub.length() == 1 || sub.length() == 2) {
            return true;
        }
        if (sub.length() % 2 == 0) {
            // 偶数
            String subRight = sub.substring(sub.length() / 2, sub.length());
            String right = new StringBuffer(subRight).reverse().toString();
            String left = sub.substring(0, sub.length() / 2);
            return left.equals(right);
        } else {
            // 奇数
            // 获取中间当数
            int mid = (sub.length() - 1) / 2;
            String subRight = sub.substring(mid + 1, sub.length());
            String right = new StringBuffer(subRight).reverse().toString();
            String left = sub.substring(0, mid);
            return left.equals(right);
        }
    }
}
