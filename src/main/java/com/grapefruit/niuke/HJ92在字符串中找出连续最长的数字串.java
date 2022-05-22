/*
 *Copyright @2021 Grapefruit. All rights reserved.
 */

package com.grapefruit.niuke;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 相关描述
 *
 * @author zhihuangzhang
 * @version 1.0
 * @date 2022-05-22 14:47
 */
public class HJ92在字符串中找出连续最长的数字串 {
    static Pattern p = Pattern.compile("[a-zA-z]");

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String str = s.nextLine();
            Matcher matcher = p.matcher(str);
            String[] split = matcher.replaceAll(",").split(",");
            Arrays.sort(split, Comparator.comparingInt(String::length).reversed());
            if (split.length >= 1) {
                int max = split[0].length();
                for (String value : split) {
                    int tmp = value.length();
                    if (tmp >= 1 && tmp == max) {
                        System.out.print(value);
                    }
                }
                System.out.print("," + max);
            }
        }
    }
}
