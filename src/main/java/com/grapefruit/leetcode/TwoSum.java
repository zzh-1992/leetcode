/*
 *Copyright @2021 Grapefruit. All rights reserved.
 */

package com.grapefruit.leetcode;

/**
 * 相关描述
 *
 * @author zhihuangzhang
 * @version 1.0
 * @date 2021-05-30 12:35 上午
 */
public class TwoSum {
}
//  题目链接:https://leetcode.com/problems/two-sum/

/**
 * 使用双层循环
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] o = new int[2];
        for(int i = 0;i< nums.length;i++){
            for(int j = i + 1;j< nums.length;j++){
                int r = nums[i] + nums[j];
                if(r == target){
                    o[0] = i;
                    o[1] = j;
                }
            }
        }
        return o;
    }
}

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
