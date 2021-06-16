package jia.JZoffer.medium;

/**
 * @author JiaYanZhao
 * @date 2021/6/4 16:36
 *
 * 求 1+2+3+...+n
 * 描述
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、
 * switch、case等关键字及条件判断语句（A?B:C）。
 */
public class JZ47 {
    public static void main(String[] args) {
        // 未完待续
        Sum_Solution(10);
        int a = 10;
        System.out.println(a += 10);
    }

    /**
     * n * (n + 1) / 2 = (n^2 + n) / 2
     * 用右移代替除2操作
     * @param n
     * @return
     */
    public static int Sum_Solution(int n) {
        return (int)(Math.pow(n, 2) + n) >> 1;
    }

    /**
     * 使用 && 断路
     * @param n
     * @return
     */
    public static int Sum_Solution2(int n) {
        int sum=n;
        boolean bool=(n!=0) && ((sum+=Sum_Solution(n-1))!=0);
        return sum;
    }
}
