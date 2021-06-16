package com.jia.huawei.difficult;

import java.util.Scanner;
/**
 * @author JiaYanZhao
 * @date 2021/6/16 17:21
 */
public class HJ1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int len = str.length();
        while(len > 0){
            len--;
            char c = str.charAt(len);
            if (c == ' '){
                len++;
                break;
            }
        }
        System.out.print(str.length() - len);
    }
}