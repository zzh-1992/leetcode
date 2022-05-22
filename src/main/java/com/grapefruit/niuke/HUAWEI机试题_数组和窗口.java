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
 * @date 2022-05-22 15:07
 */
public class HUAWEI机试题_数组和窗口 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        /*String line = s.nextLine();

        for (char c : line.toCharArray()) {
            if(c >= 'a'){
                System.out.println(c);
            }
        }*/
        // 元素个数
        int N = Integer.parseInt(s.nextLine());
        // 数组
        String[] arr = s.nextLine().split(" ");
        // 窗口
        int M = Integer.parseInt(s.nextLine());

        int max = Integer.MIN_VALUE;

        // 计算
        for (int i = 0; i < N - M + 1; i++) {
            int tmp = 0;
            for (int j = 0; j < M; j++) {
                tmp += Integer.parseInt(arr[i + j]);
            }
            max = Math.max(max, tmp);
        }
        System.out.println(max);
    }
}
