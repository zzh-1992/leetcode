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
 * @date 2022-05-22 13:54
 */
public class HJ12字符串反转 {
    public static void main(String[] asrgs) {
        Scanner input = new Scanner(System.in);
        if (input.hasNext()) {
            String s = input.nextLine();
            for (int i = s.length() - 1; i >= 0; i--) {
                System.out.print(new String(s.toCharArray(), i, 1));
                //System.out.print(sub.substring(i,i+1));
            }
        }
    }
}
