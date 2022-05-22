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
 * @date 2022-05-22 13:56
 */
public class HJ61放苹果 {
    public static void main(String[] asrgs) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int apple = input.nextInt();
            int panel = input.nextInt();
            System.out.println(fun(apple, panel));
        }
    }

    public static int fun(int apple, int panel) {
        if (apple == 0 || apple == 1 || panel == 1) {
            // 当苹果为空或者苹果为1或只有一个盘子的时候
            return 1;
        } else if (apple < panel) {
            // 当苹果个数小于盘子个数时
            return fun(apple, apple);
        } else {
            // 当苹果个数大于盘子个数时
            return fun(apple, panel - 1) + fun(apple - panel, panel);
        }
    }
}
