package com.jia.huawei.difficult;

import java.util.Scanner;
import java.lang.Integer;
/**
 * @author JiaYanZhao
 * @date 2021/6/16 17:18
 */
public class HJ5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) {
            String str = in.nextLine();
            System.out.println(Integer.valueOf(str.substring(2), 16));
        }
    }
}