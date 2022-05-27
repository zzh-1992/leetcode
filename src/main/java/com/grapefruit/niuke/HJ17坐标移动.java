/*
 *Copyright @2021 Grapefruit. All rights reserved.
 */

package com.grapefruit.niuke;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 相关描述
 *
 * @author zhihuangzhang
 * @version 1.0
 * @date 2022-05-22 13:53
 */
public class HJ17坐标移动 {

    public static void main(String[] asrgs) {
        Scanner input = new Scanner(System.in);
        String regex = "[A|W|D|S]([0-9]{2}|[0-9]{1})";
        int x = 0;
        int y = 0;
        if (input.hasNext()) {
            String[] arr = input.nextLine().split(";");
            for (String str : arr) {
                boolean flag = Pattern.matches(regex, str);
                if (flag) {
                    String s1 = str.substring(0, 1);
                    String s2 = str.substring(1, str.length());
                    int value = Integer.parseInt(s2);
                    if ("A".equals(s1) || Pattern.matches(regex, s2)) {
                        x = x - value;
                    }
                    if ("D".equals(s1)) {
                        x = x + value;
                    }
                    if ("W".equals(s1)) {
                        y = y + value;
                    }
                    if ("S".equals(s1)) {
                        y = y - value;
                    }
                }
            }
            System.out.println(x + "," + y);
        }
    }
}
