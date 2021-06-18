package com.jia.huawei.difficult;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author JiaYanZhao
 * @date 2021/6/17 11:05
 * 字符串分隔
 *
 *  连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 *  长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 */


public class HJ4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        String zeroStr = "00000000";
        while(in.hasNext()) {
            String str = in.nextLine();
            if (str == null || str.isEmpty()){
                continue;
            }

            int len = str.length();
            int tempEnd = 8;
            for(int i = 0; i < len; i+=8, tempEnd+=8){
                if(tempEnd < len) {
                    sb.append(str.substring(i, tempEnd)).append("\n");
                } else {
                    sb.append(str.substring(i, len)).append(zeroStr.substring(0, tempEnd - len)).append("\n");
                }
            }
        }
        System.out.print(sb);
    }

    public static void method2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String zeroStr = "00000000";
        String str;
        int tempEnd, len;
        while((str = br.readLine()) != null) {
            len = str.length();
            tempEnd = 8;
            for(int i = 0; i < len; i+=8, tempEnd+=8){
                if(tempEnd < len) {
                    System.out.println(str.substring(i, tempEnd));
                } else {
                    System.out.println(str.substring(i, len) + zeroStr.substring(0, tempEnd - len));
                }
            }
        }
    }

    public static void method3() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] zeroArr = new char[]{'0', '0', '0', '0', '0', '0', '0', '0'};
        String str;
        int tempEnd, len;
        while((str = br.readLine()) != null) {
            len = str.length();
            char[] chars = str.toCharArray();
            tempEnd = 8;
            for(int i = 0; i < len; i+=8, tempEnd+=8){
                if(tempEnd < len) {
                    System.out.println(new String(Arrays.copyOfRange(chars, i, tempEnd)));
                } else {
                    System.out.println(new String(Arrays.copyOfRange(chars, i, len)) + new String(Arrays.copyOfRange(zeroArr, 0, tempEnd - len)));
                }
            }
        }
    }
}
