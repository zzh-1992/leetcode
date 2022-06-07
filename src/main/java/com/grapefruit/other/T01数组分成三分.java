package com.grapefruit.other;

/**
 * 输入 1个自然数组，选取其中两个数字 num[i],num[j],把数组分成三分
 * <p>
 * 每一部分的累加和（不包括分割点的数字）相等
 * <p>
 * 例如 num[] = [2,1,3,1,1,1,5,3]; 选取nums[2] = 3;num[6] = 5;
 * <p>
 * 三部分的和都是3，则打印2，6
 * <p>
 * 如果找不到符合条件的等分点，返回失败（数组大小的量级最大是10的5次方）
 * <p>
 * 要求 1 编码规范 2 算法效率 3 高重量编程 4 防御性编程
 *
 * @author zhihuangzhang
 * @version 1.0
 * @date 2022-06-07 20:38
 */
public class T01数组分成三分 {

    public static void main(String[] args) {

        int[] num = new int[]{2, 1, 3, 1, 1, 1, 5, 3};

        num = new int[]{1,1,1,1,1};
        if (num.length <= 4) {
            System.out.println(false);
            return;
        }

        // left范围 1 到 n-4
        // right范围 3 到 n-2

        // 获取数组总和
        int all = getSub(num, 0, num.length);

        for (int i = 1; i <= num.length - 4; i++) {
            for (int j = i + 2; j <= num.length - 2; j++) {
                // 获取左右分割点的值
                int l = num[i];
                int r = num[j];

                // 获取三部分的和
                int tmp = all - (l + r);
                if (tmp % 3 == 0) {
                    // 获取左部分累加和
                    int t1 = getSub(num, 0, i);
                    // 获取右部分累加和
                    int t2 = getSub(num, j + 1, num.length);
                    if (t1 == t2 && tmp / 3 == t1) {
                        System.out.println(i + "," + j);
                        break;
                    }
                }
            }
        }
    }

    // 获取区间累加和
    public static int getSub(int[] num, int l, int r) {
        int tmp = 0;
        for (int i = l; i < r; i++) {
            tmp += num[i];
        }
        return tmp;
    }
}
