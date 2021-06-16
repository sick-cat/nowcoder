package com.jia.huawei.difficult;

import java.util.Scanner;

/**
 * @author JiaYanZhao
 * @date 2021/6/16 17:22
 *
 * 计算某字母出现次数，不计大小写
 *
 */
public class HJ2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char achar = in.next().charAt(0);
        in.close();
        // 转为大写
        achar = achar < 'a' ? achar : (char) (achar - 32);
        int len = str.length();
        int res = 0;
        while(--len >= 0){
            int sub = str.charAt(len) - achar;
            if(sub == 0 || sub == 32){
                res++;
            }
        }
        System.out.println(res);
    }
}
