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
 * @date 2022-05-22 16:36
 */
public class HUAWEI机试题_拼接URL {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] arr = str.split(",");
        if (arr.length == 0) {
            System.out.print("/");
        } else {
            System.out.print("/");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i].replace("/", ""));
                if (i != arr.length - 1) {
                    System.out.print("/");
                }
            }
        }
    }
}
