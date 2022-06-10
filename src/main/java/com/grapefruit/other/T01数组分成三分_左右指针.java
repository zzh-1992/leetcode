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
public class T01数组分成三分_左右指针 {

    public static void main(String[] args) {

        int[] num = new int[]{2, 1, 3, 1, 1, 1, 5, 3};

        num = new int[]{0,0,1, 1, 1, 1, 1};
        if (num.length <= 4) {
            System.out.println(false);
            return;
        }

        // left范围 1 到 n-4
        // right范围 3 到 n-2

        // 获取数组总和
        int all = getSub(num, 0, num.length);

        int leftIndex = 1;
        int rightIndex = num.length - 2;

        boolean isFind = false;

        while (leftIndex <= num.length - 4) {
            // 获取左右分割点的值
            int leftSum = getSub(num, 0, leftIndex);
            int rightSum = getSub(num, rightIndex + 1, num.length);
             if (leftSum == rightSum) {
                // 获取三部分的和(去除两个分割点对应的元素值)
                int threePartSum = all - (num[leftIndex] + num[rightIndex]);

                // 当左中右当三部分累加和能被3整除,并且左/右  == 1/3的threePartSum(找到需要的分割点)
                if (threePartSum % 3 == 0 && leftSum == threePartSum / 3) {
                    System.out.println(leftIndex + "," + rightIndex);
                    isFind = true;
                    break;

                }
            } else if (leftSum < rightSum) {
                // 当左边累加和 < 右边累加和时
                ++leftIndex;
            } else {
                // 当右边累加和 > 左边累加和时
                --rightIndex;
            }
        }
        System.out.println(!isFind ? false : "");
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
