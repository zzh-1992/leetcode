/*
 *Copyright @2021 Grapefruit. All rights reserved.
 */

package com.grapefruit.niuke;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 相关描述
 *
 * @author zhihuangzhang
 * @version 1.0
 * @date 2022-05-22 13:55
 */
public class HJ102字符统计 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        HashMap<Character, Integer> map = new HashMap();
        char[] arr = str.toCharArray();
        for (char key : arr) {
            if (map.containsKey(key)) {
                int value = map.get(key);
                map.put(key, ++value);
            } else {
                map.put(key, 1);
            }
        }
        map.entrySet().stream().sorted(
                (o1, o2) -> {
                    if (o2.getValue().intValue() != o1.getValue()) {
                        // 安装字符个数排序
                        return o2.getValue() - o1.getValue();
                    } else {
                        // 字符个数相同按照ASCII排序
                        return o1.getKey() - o2.getKey();
                    }
                }
        ).map(Map.Entry::getKey).forEach(System.out::print);
    }
}
