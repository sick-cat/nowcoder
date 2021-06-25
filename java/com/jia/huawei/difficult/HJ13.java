package com.jia.huawei.difficult;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author JiaYanZhao
 * @date 2021/6/25 16:49
 *
 * 句子逆序
 *
 * 描述
 * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 *
 * 输入描述：
 * 输入一个英文语句，每个单词用空格隔开。保证输入只包含空格和字母。
 *
 * 输出描述：
 * 得到逆序的句子
 */
public class HJ13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();
        String[] strArr = str.split(" ");
        int len = strArr.length;
        while (--len > 0) {
            sb.append(strArr[len]).append(" ");
        }
        sb.append(strArr[0]);
        System.out.println(sb.toString());
    }
}
