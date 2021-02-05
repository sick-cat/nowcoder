import java.util.Arrays;

/**
 * @author JiaYanZhao
 * @date 2021/2/3 16:52
 * <p>
 * 构建乘积数组
 * <p>
 * 题目描述
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1] (乘积中没有A[i])。
 * 不能使用除法。（注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
 * 对于A长度为1的情况，B无意义，故而无法构建，因此该情况不会存在。
 */
public class JZ51 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] B = multiply2(arr);
        System.out.println(Arrays.toString(B));
    }

    /**
     * 把B[i]分为两部分
     * 左边 A[0]*A[1]*...*A[i-1]
     * 右边 A[i+1]*...*A[n-1]
     * 记录下所有B[i]的左边和右边部分，时间复杂度为 O(n)。
     *
     * @param A
     * @return
     */
    public static int[] multiply(int[] A) {
        int len = A.length;
        int[] left = new int[len];
        int[] right = new int[len];
        int[] result = new int[len];
        left[0] = 1;
        right[len - 1] = 1;
        for (int i = 1; i < len; i++) {
            left[i] = left[i - 1] * A[i - 1];
            right[len - i - 1] = right[len - i] * A[len - i];
        }
        for (int i = 0; i < len; i++) {
            result[i] = left[i] * right[i];
        }
        return result;
    }

    /**
     * 优化空间复杂度
     *
     * @param A
     * @return
     */
    public static int[] multiply2(int[] A) {
        int len = A.length;
        int[] result = new int[len];
        result[0] = 1;
        for (int i = 1; i < len; i++) {
            result[i] = result[i - 1] * A[i - 1];
        }
        int tem = 1;
        for (int i = len - 2; i >= 0; i--) {
            tem *= A[i + 1];
            result[i] = result[i] * tem;
        }
        return result;
    }
}
