package com.jia.huawei.medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author JiaYanZhao
 * @date 2021/6/25 15:52
 *
 *  提取不重复的整数
 * 描述：
 *   输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 * 保证输入的整数最后一位不是0。
 *
 * 输入描述：
 * 输入一个int型整数
 *
 * 输出描述：
 * 按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
 */
public class HJ9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Integer num = Integer.valueOf(s);

        int res = 0;
        boolean[] flagArr = new boolean[10];
        while (num > 0) {
            int mod = num % 10;
            num /= 10;
            if (!flagArr[mod]) {
                flagArr[mod] = true;
                res = res * 10 + mod;
            }
        }
        System.out.println(res);
    }
}
