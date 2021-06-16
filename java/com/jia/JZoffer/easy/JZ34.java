package jia.JZoffer.easy;

/**
 * @author JiaYanZhao
 * @date 2021/1/31 16:18
 * 第一个只出现一次的字符（字符串）
 * <p>
 * 题目描述
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
 * 并返回它的位置, 如果没有则返回 -1（需要区分大小写）.（从0开始计数）
 */
public class JZ34 {

    public static void main(String[] args) {
        String str = "gooygttttttle";
        int i = FirstNotRepeatingChar(str);
        System.out.println(i);
    }

    public static int FirstNotRepeatingChar(String str) {
        char[] chars = str.toCharArray();
        // 对每个字母进行计数
        int[] intArr = new int[58];
        for (char aChar : chars) {
            intArr[aChar-65] ++;
        }
        // 遍历源字符串中的的字符，查第一个个数为一的字符
        for (int i = 0; i < chars.length; i++) {
            if (intArr[chars[i] - 65] == 1) {
                return i;
            }
        }
        return -1;
    }
}
