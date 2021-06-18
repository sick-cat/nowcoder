package com.jia.huawei.medium;

import java.io.*;
import java.util.TreeMap;

/**
 * @author JiaYanZhao
 * @date 2021/6/17 13:25
 * 合并表记录
 * 数据表记录包含表索引和数值（int范围的正整数），请对表索引相同的记录进行合并，
 * 即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 */
public class HJ8 {
    public static void main(String[] args) throws IOException {
        method2();
    }

    public static void method1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while (n > 0) {
            String[] strArr = br.readLine().split(" ");
            int key = Integer.parseInt(strArr[0]);
            int value = Integer.parseInt(strArr[1]);
            Integer tem = map.get(key);
            map.put(key, tem == null ? value : tem + value);
            n--;
        }
        StringBuilder sb = new StringBuilder();
        map.forEach((key, value) -> sb.append(key).append(" ").append(value).append("\n"));
        System.out.println(sb.toString());
    }

    /**
     * 巧合
     * @throws IOException
     */
    public static void method2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        while (n > 0) {
            String[] strArr = br.readLine().split(" ");
            int key = Integer.parseInt(strArr[0]);
            int value = Integer.parseInt(strArr[1]);
            arr[key] += value;
            n--;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                sb.append(i).append(" ").append(arr[i]).append("\n");
            }
        }
        System.out.println(sb.toString());
    }

    public static void method3() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        boolean[] flagArr = new boolean[n];
        while (n > 0) {
            String[] strArr = br.readLine().split(" ");
            int key = Integer.parseInt(strArr[0]);
            int value = Integer.parseInt(strArr[1]);
            arr[key] += value;
            flagArr[key] = true;
            n--;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (flagArr[i]){
                sb.append(i).append(" ").append(arr[i]).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
