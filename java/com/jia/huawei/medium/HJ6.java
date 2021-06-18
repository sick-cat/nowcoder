package com.jia.huawei.medium;

import java.io.*;

/**
 * @author JiaYanZhao
 * @date 2021/6/17 12:17
 *
 * 质数因子
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子
 * （重复的也要列举）（如180的质因子为2 2 3 3 5 ）
 * 最后一个数后面也要有空格
 */
public class HJ6 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long ll = Long.parseLong(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i *i <= ll; i++) {
            System.out.println(i);
            if (ll % i == 0){
                sb.append(i).append(" ");
                ll /= i;
                i--;
            }
        }
        sb.append(ll).append(" ");
        System.out.println(sb.toString());
    }
}
