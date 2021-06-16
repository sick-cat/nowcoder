package jia.JZoffer.medium;

/**
 * @author JiaYanZhao
 * @date 2021/6/4 15:18
 * <p>
 * 剪绳子
 * 描述
 * 给你一根长度为n的绳子，请把绳子剪成整数长的m段（m、n都是整数，n>1并且m>1，m<=n），
 * 每段绳子的长度记为k[1],...,k[m]。请问k[1]x...xk[m]可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 * 输入描述：
 * 输入一个数n，意义见题面。（2 <= n <= 60）
 */
public class JZ67 {
    public static void main(String[] args) {
        System.out.println(cutRope(8));
    }

    /**
     * 有规律可循（都是基于2,3,4去做分解）
     * n = 2 : 1 * 1
     * n = 3 : 1 * 2
     * n = 4 : 2 * 2
     * n = 5 : 2 * 3
     * n = 6 : 3 * 3
     * n = 7 : 3 * 2 * 2
     * n = 8 : 3 * 3 * 2
     * n = 9 : 3 * 3 * 3
     *
     * @param target
     * @return
     */
    public static int cutRope(int target) {
        if (target == 2) {
            return 1;
        } else if (target == 3) {
            return 2;
        } else if (target % 3 == 0) {
            return (int) Math.pow(3, target / 3);
        } else if (target % 3 == 1){
            return (int) (4 * Math.pow(3, target / 3 - 1));
        } else {
            return (int) (2 * Math.pow(3, target / 3));
        }
    }
}
