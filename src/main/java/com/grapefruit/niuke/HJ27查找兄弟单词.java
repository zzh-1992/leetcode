package com.grapefruit.niuke;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HJ27查找兄弟单词 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputStr = scanner.nextLine().split(" ");

        int n = Integer.parseInt(inputStr[0]);

        ArrayList<String> list = new ArrayList<>(Arrays.asList(inputStr).subList(1, n + 1));

        // 目标单词
        String lastOne = inputStr[inputStr.length - 2];
        // 对目标单词排序a->z
        String[] target = sort(lastOne);

        int k = Integer.parseInt(inputStr[inputStr.length - 1]);

        // 过滤兄弟单词
        List<String> targetList =
                list.stream().filter(obj -> isBrother(obj, lastOne, target)).sorted().collect(Collectors.toList());
        System.out.println(targetList.size());
        if (targetList.size() >= k - 1) {
            System.out.println(targetList.get(k - 1));
        }
    }

    // 判断是否为兄弟单词 true:是
    public static boolean isBrother(String str, String lastOne, String[] target) {
        if (lastOne.equals(str) || str.length() != target.length) {
            return false;
        }

        String[] split = sort(str);

        for (int i = 0; i < target.length; i++) {
            if (!target[i].equals(split[i])) {
                return false;
            }
        }
        return true;
    }

    // 分割字符并排序
    public static String[] sort(String str) {
        String[] split = str.split("");
        Arrays.sort(split);
        return split;
    }
}
