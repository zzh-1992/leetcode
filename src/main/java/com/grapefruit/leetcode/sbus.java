/*
 *Copyright @2021 Grapefruit. All rights reserved.
 */

package com.grapefruit.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 相关描述
 *
 * @author zhihuangzhang
 * @version 1.0
 * @date 2021-05-30 7:31 上午
 */
public class sbus {

    public static void main(String[] args) {
        String s = "234";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<String> set = new HashSet<>(0);;
        for(int i = 0;i< s.length();i++){
            if(set.size() > 0){
                set = new HashSet<>(0);
            }
            for(int j = s.length();j > i;j--){
                String sub = s.substring(i,j);
                for (char c: sub.toCharArray()) {
                    set.add(c + "");
                }
                if(set.size() == sub.length()){
                    return set.size();
                }
            }
        }
        return set.size();
    }
}
// 题目链接:https://leetcode.com/problems/longest-substring-without-repeating-characters/
class Solution_ {
    public int lengthOfLongestSubstring(String s) {
        Set<String> set = new HashSet<>(0);;
        for(int i = 0;i< s.length();i++){
            if(set.size() > 0){
                set = new HashSet<>(0);
            }
            for(int j = s.length();j > i;j--){
                String sub = s.substring(i,j);
                for (char c: sub.toCharArray()) {
                    set.add(c + "");
                }
                if(set.size() == sub.length()){
                    return set.size();
                }
            }
        }
        return set.size();
    }
}

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * Example 4:
 *
 * Input: s = ""
 * Output: 0
 */
