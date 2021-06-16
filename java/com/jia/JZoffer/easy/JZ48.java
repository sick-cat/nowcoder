package jia.JZoffer.easy;

/**
 * @author JiaYanZhao
 * @date 2021/2/3 9:31
 *
 * 不用加减乘除做加法
 *
 * 题目描述
 *  写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */
public class JZ48 {

    public static void main(String[] args) {

        System.out.println(Add(300, -1));
    }

    /**
     * 抄的题解 ^_^ , 模拟二进制加法
     * @param num1
     * @param num2
     * @return
     */
    public static int Add(int num1,int num2) {
        while (num2 != 0){
            int c = (num1 & num2) << 1;
            num1 ^= num2;
            num2 = c;
        }
        return num1;
    }
}
