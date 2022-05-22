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
 * @date 2022-05-22 16:22
 */
public class HUAWEI机试题_最长连续子序 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] arr = s.nextLine().split(",");
        int sum = s.nextInt();

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int tmp = 0;
            for (int j = 0; j < i; j++) {
                tmp += Integer.parseInt(arr[j]);
            }
            if (tmp == sum) {
                max = Math.max(max, i);
            }
        }
        if (max == Integer.MIN_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(max);
        }
    }
}
