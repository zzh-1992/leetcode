package com.grapefruit.niuke;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
public class HJ65查找两个字符串a_b中的最长公共子串 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        if(s1.length() > s2.length()){
            String tmp = s1;
            s1 = s2;
            s2 = tmp;
        }

        Map<Integer,List<String>> map = new HashMap();
        int tmp = 0;
        for(int i = 0;i< s1.length();i++){
            for(int j = i + 1;j< s1.length();j++){
             String sub = s1.substring(i,j);
                if(s2.contains(sub) && sub.length() >= tmp ){
                    tmp = sub.length();
                    if(map.containsKey(tmp)){
                        map.get(tmp).add(sub);
                    }else{
                        List<String> list = new ArrayList();
                        list.add(sub);
                        map.put(tmp,list);
                    }
                }
            }
        }
        Optional<Integer> first = map.keySet().stream().sorted().findFirst();

        if(first.isPresent() && !map.get(first.get()).isEmpty()){
            System.out.println(map.get(tmp).get(0));
        }
    }
}
