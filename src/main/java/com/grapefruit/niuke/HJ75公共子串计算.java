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
 * @date 2022-05-22 13:52
 */
public class HJ75公共子串计算 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();

        int l = s1.length();
        int max = 0;
        for (int i = 0; i <= l; i++) {
            for (int j = i + 1; j <= l; j++) {
                String sub = s1.substring(i, j);
                if (s2.contains(sub)) {
                    max = Math.max(max, sub.length());
                }
            }
        }
        System.out.println(max);
    }
}
