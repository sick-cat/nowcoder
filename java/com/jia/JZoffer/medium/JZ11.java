package jia.JZoffer.medium;

/**
 * @author JiaYanZhao
 * @date 2021/6/4 15:52
 *
 * 二进制中1的个数
 * 描述
 * 输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
 */
public class JZ11 {
    public static void main(String[] args) {
        System.out.println(NumberOf1(-10));

    }

    /**
     * 无符号右移，直到 n 为零
     * @param n
     * @return
     */
    public static int NumberOf1(int n) {
        int num = 0;
        while (n != 0){
            num = num + (n&1);
            n = n >>> 1;
        }
        return num;
    }
}
