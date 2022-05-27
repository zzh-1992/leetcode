/*
 *Copyright @2021 Grapefruit. All rights reserved.
 */

package com.grapefruit.niuke;


import java.util.Scanner;
import java.util.HashMap;

/**
 * 相关描述
 *
 * @author zhihuangzhang
 * @version 1.0
 * @date 2021-07-14 11:28 上午
 */
@SuppressWarnings("unchecked")
public class HJ22汽水瓶{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap();
        while(input.hasNext()){
            int i = input.nextInt();
            if(i == 0){
                continue;
            }
            map.put("v",0);
            drink( i, map);
            System.out.println(map.get("v"));
        }
    }
    public static void drink(int i,HashMap<String,Integer> map){
        if(i >= 3){
            // 第一喝的数量
            int tmp = i / 3;
            // 剩余
            int left = i % 3;

            map.put("v",map.get("v") + tmp);
            // 第二次时候的空瓶子
            int n = tmp + left;
            if(n == 2){
                n = n + 1;
            }
            drink( n, map);
        }
    }
}
