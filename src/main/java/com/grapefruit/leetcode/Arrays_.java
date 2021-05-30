/*
 *Copyright @2021 Grapefruit. All rights reserved.
 */

package com.grapefruit.leetcode;

import java.util.Arrays;

/**
 * 相关描述
 *
 * @author zhihuangzhang
 * @version 1.0
 * @date 2021-05-30 8:10 上午
 */
public class Arrays_ {
    public static void main(String[] args) {
        Solution_4 s = new Solution_4();
        int[] a = {1,3};
        int[] b = {2};
        s.findMedianSortedArrays(a,b);
    }
}
// 题目链接:https://leetcode.com/problems/median-of-two-sorted-arrays/
class Solution_4 {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        Arrays.sort(c);

        int m = c.length;

        if(c.length % 2 ==1){
            int index = m/2;
            double j = c[index];
            return j;
        }else {
            int index = m/2;
            double j = (c[index] + c[index-1])/2.0000;
            return j;
        }
    }
}

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 *
 * The overall run time complexity should be O(log (m+n)).
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * Example 2:
 *
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 * Example 3:
 *
 * Input: nums1 = [0,0], nums2 = [0,0]
 * Output: 0.00000
 * Example 4:
 *
 * Input: nums1 = [], nums2 = [1]
 * Output: 1.00000
 * Example 5:
 *
 * Input: nums1 = [2], nums2 = []
 * Output: 2.00000
 *
 *
 * Constraints:
 *
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -106 <= nums1[i], nums2[i] <= 106
 */


