package com.jia.huawei.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author JiaYanZhao
 * @date 2021/6/17 13:19
 * 取近似值
 *
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。
 * 如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 */
public class HJ7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float fvalue = Float.parseFloat(br.readLine());
        int num = (int) fvalue;
        if (fvalue - num >= 0.5){
            System.out.println(++num);
        } else {
            System.out.println(num);
        }
    }
}
