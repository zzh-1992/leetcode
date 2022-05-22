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
 * @date 2022-05-22 13:55
 */
public class HJ106字符逆序 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.substring(i, i + 1));
        }
        System.out.println(sb);
    }
}
