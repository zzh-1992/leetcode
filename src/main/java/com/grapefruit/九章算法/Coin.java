/*
 *Copyright @2021 Grapefruit. All rights reserved.
 */

package com.grapefruit.九章算法;

/**
 * 669 Coin Change
 *
 * @author zhihuangzhang
 * @version 1.0
 * @date 2022-05-12 20:33
 */
public class Coin {

    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{2, 5, 7}, 27));
    }

    //                    {2,5,7} // 27
    public static int coinChange(int[] A, int M) {
        // 0...n: [n+1]
        // 0...n-1:[n]
        int[] f = new int[M + 1];

        //number of kind coins 有多少枚硬币
        int n = A.length;

        // initialization
        f[0] = 0;

        int i;
        int j;
        // f[1],f[2],...,f[27]
        for (i = 1; i <= M; ++i) {
            f[i] = Integer.MAX_VALUE;
            // last coin A[j]
            // f[i] = min{f[i-A[0]]+1,...,f[i-A[n-1]+1}
            for (j = 0; j < n; ++j) {
                if (i >= A[j] && f[i - A[j]] != Integer.MAX_VALUE) {
                    f[i] = Math.min(f[i - A[j]] + 1, f[i]);
                }
            }
        }
        if (f[M] == Integer.MAX_VALUE) {
            f[M] = -1;
        }
        return f[M];
    }
}
