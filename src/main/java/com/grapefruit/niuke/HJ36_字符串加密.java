package com.grapefruit.niuke;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class HJ36_字符串加密 {

    public static void main(String[] args) {
        // A-Z
        List<Character> basic = new ArrayList();
        for (char i = 'A'; i <= 'Z'; i++) {
            basic.add(i);
        }
        Scanner scanner = new Scanner(System.in);
        // 密钥
        String key = scanner.nextLine();
        // 明文
        String str = scanner.nextLine();
        char[] arr = key.toUpperCase(Locale.ROOT).toCharArray();
        List<Character> list = new ArrayList();
        // 移除重复的字符
        for (char sub : arr) {
            if (!list.contains(sub)) {
                list.add(sub);
            }
        }
        // 映射表
        for (Character character : basic) {
            if (list.contains(character)) {
                continue;
            }
            list.add(character);
        }

        HashMap<Character, Character> mapUpper = new HashMap<>();
        HashMap<Character, Character> mapLower = new HashMap<>();
        // 映射map
        for (int j = 0; j < 2; j++) {
            if (j == 1) {
                for (int i = 0; i < 26; i++) {
                    mapUpper.put(basic.get(i), list.get(i));
                }
            } else {
                for (int i = 0; i < 26; i++) {
                    mapLower.put((char) (basic.get(i) + 32), (char) (list.get(i) + 32));
                }
            }
        }

        // 依据明文映射输出每个字符
        for (char c : str.toCharArray()) {
            System.out.print(mapLower.containsKey(c) ? mapLower.get(c) : mapUpper.get(c));
        }
    }
}
