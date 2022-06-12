/*
 *Copyright @2021 Grapefruit. All rights reserved.
 */

package com.grapefruit.leetcode;

import java.util.Arrays;

/**
 * 打家劫舍
 *
 * @author zhihuangzhang
 * @version 1.0
 * @date 2022-06-11 15:32
 */
public class Leetcode198打家劫舍 {

    public static void main(String[] args) {

        int[] nums = new int[]{2, 7, 9, 3, 1};

        System.out.println("抢劫的最大值:" + rob(nums));
    }

    public static int rob(int[] nums) {
        // 存储之前抢劫过的最大值
        int[] menory = new int[nums.length];

        Arrays.fill(menory, -1);

        // 下标0的时候初始化
        menory[0] = nums[0];

        for (int i = 0; i < nums.length; i++) {
            // 依次从下标0开始(只抢i及i下标之前的)
            robbery(i, nums, menory);
        }
        return menory[menory.length - 1];
    }

    public static int robbery(int i, int[] nums, int[] menory) {
        if (i < 0 || i >= nums.length) {
            return 0;
        } else {
            if (menory[i] != -1) {
                return menory[i];
            }
            // 从后往前抢(比如i = 3; 那么理解为从序号3->0)考虑的第一元素是num[3] ,这个元素可抢可不抢.抢的时候就是当前元素 + 前两个元素的最大值; 不抢的时候就是下一个元素抢的最大值

            // 抢劫当前序号 + 前两个序号
            int r1 = nums[i] + robbery(i - 2, nums, menory);
            //return r1;

            // 不抢劫当前序号 + 下一个序号
            int r2 = robbery(i - 1, nums, menory);

            // 返回当前序号下的最大值
            menory[i] = Math.max(r1, r2);
            return menory[i];
        }
    }
}
