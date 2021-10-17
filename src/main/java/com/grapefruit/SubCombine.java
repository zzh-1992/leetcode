package com.grapefruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 获取数组元素的所有排列组合 网友博客链接 https://blog.csdn.net/u010215407/article/details/52164761?spm=1001.2014.3001.5501
 *
 * @author zhihuangzhang
 * @since 2021-10-17 18:00:00
 */
public class SubCombine {

    public static void main(String[] args) {
        String[] a = new String[]{"1", "2", "3", "4", "5"};
        List<String> list = Arrays.asList(a);
        List<List<Object>> aa = str(list);
        for (List<Object> ss : aa) {
            for (Object s : ss) {
                System.out.print(s);
            }
            System.out.println();
        }
    }

    public static List<List<Object>> str(List<String> list) {
        List<List<Object>> result = new ArrayList<>();
        long n = (long) Math.pow(2, list.size());
        List<Object> combine;
        for (long l = 0L; l < n; l++) {
            combine = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if ((l >>> i & 1) == 1) {
                    combine.add(list.get(i));
                }
            }
            result.add(combine);
        }
        return result;
    }
}