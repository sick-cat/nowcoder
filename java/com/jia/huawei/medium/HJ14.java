package com.jia.huawei.medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author JiaYanZhao
 * @date 2021/6/25 16:58
 * 字符串排序
 *
 * 描述
 * 给定n个字符串，请对n个字符串按照字典序排列。
 * 输入描述：
 * 输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
 * 输出描述：
 * 数据输出n行，输出结果为按照字典序排列的字符串。
 */
public class HJ14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] strArr = new String[n];
        for (int i = 0; i < n; i++) {
            strArr[i] = br.readLine();
        }
//        List<String> list = new ArrayList<>();
//        list.stream().sorted();
        Arrays.sort(strArr);
        StringBuilder sb = new StringBuilder();
        for (String s : strArr) {
            sb.append(s).append("\n");
        }
        System.out.println(sb.toString());
    }
}
