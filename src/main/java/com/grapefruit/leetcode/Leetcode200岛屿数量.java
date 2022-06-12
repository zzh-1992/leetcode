package com.grapefruit.leetcode;

public class Leetcode200岛屿数量 {

    public static void main(String[] args) {
        char[][] grid = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {

        int v = grid.length; // 行
        int h = grid[0].length; // 列
        int number = 0;
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < h; j++) {
                number = affect(i, j, grid, v, h) + number;
            }
        }

        return number;
    }

    public static int affect(int x, int y, char[][] arr, int v, int h) {
        // 边界 超出二维
        if (0 > x || x >= v || 0 > y || y >= h) {
            return 0;
        }

        // 第一次来，将其设置为2
        if (arr[x][y] == '1') {
            arr[x][y] = '2';
            // 上
            affect(x, y + 1, arr, v, h);
            // 下
            affect(x, y - 1, arr, v, h);
            // 左
            affect(x - 1, y, arr, v, h);
            // 右
            affect(x + 1, y, arr, v, h);
            return 1;
        } else {
            // 之前来过这里 1改为2 或者是0，直接返回
            //(arr[x][y] == 2 || arr[x][y] == 0)
            return 0;
        }
    }
}
