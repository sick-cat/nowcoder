import java.util.ArrayList;
import java.util.List;

/**
 * @author JiaYanZhao
 * @date 2021/1/28 13:44
 * <p>
 * 连续子数组的最大和 (分治，动态规划)
 * <p>
 * 题目描述
 * 输入一个整型数组，数组里有正数也有负数。
 * 数组中的一个或连续多个整数组成一个子数组。
 * 求子数组中和的最大值。要求时间复杂度为 O(n).
 */
public class JZ30 {
    public static void main(String[] args) {
        int i = FindGreatestSumOfSubArray(new int[]{1,-2,3,10,-4,7,2,-59});
        System.out.println(i);
    }

    /**
     * 动态规划，每一步都与前一步对比。
     * @param array
     * @return
     */
    public static int FindGreatestSumOfSubArray(int[] array) {
        int sum = 0, result = array[0];
        for (int i = 0; i < array.length; i++) {
            sum = Math.max(array[i], sum + array[i]);
            result = Math.max(result, sum);
        }
        return result;
    }
}
