package com.grapefruit.九章算法;

// 从左上角走到右下角
public class UniquePath {
    public static void main(String[] args) {
        System.out.println("uniquePath:" + uniquePath(1, 3));
    }

    public static int uniquePath(int m, int n) {
        int[][] f = new int[m][n];
        int i, j;
        for (i = 0; i < m; ++i) {
            for (j = 0; j < n; ++j) {
                if (i == 0 || j == 0) {
                    f[i][j] = 1;
                } else {
                    f[i][j] = f[i - 1][j] + f[i][j - 1];
                }
            }
        }
        return f[m - 1][n - 1];
    }
}
