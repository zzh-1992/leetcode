package com.grapefruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 获取数组元素的所有排列组合
 *
 * @author zhihuangzhang
 * @since 2021-10-17 18:00:00
 */
public class SubCombine {

    public static void main(String[] args) {
        String[] a = {"1", "2", "3"};
        List<List<String>> sub = sub(a);
        System.out.println(sub);
    }

    public static List<List<String>> sub(String[] a) {
        int n = a.length;
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                List<String> list = new ArrayList<>(Arrays.asList(a).subList(i, j + 1));
                result.add(list);
            }
        }
        return result;
    }
}