package jia.JZoffer.easy;

import java.util.HashMap;

/**
 * @author JiaYanZhao
 * @date 2021/1/28 10:38
 * <p>
 * 数组中出现次数超过一半的数字（哈希，数组）
 * <p>
 * 题目描述：
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，
 * 超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class JZ28 {

    /**
     * HashMap 解法
     *
     * @param array
     * @return
     */
    public static int MoreThanHalfNum_MySolution(int[] array) {
        int size = array.length / 2 + 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : array) {
            Integer integer = map.get(i);
            if (integer == null) {
                integer = 0;
            }
            if (integer + 1 >= size) {
                return i;
            }
            map.put(i, integer + 1);
        }
        return 0;
    }

    /**
     * 评论区投票解法
     *
     * @param array
     * @return
     */
    public static int MoreThanHalfNum_Solution(int[] array) {
        int num = array[0], numC = 0;
        for (int i = 0; i < array.length; i++) {
            if (numC == 0) {
                num = array[i];
                numC++;
            } else {
                if (num == array[i]) {
                    numC++;
                } else {
                    numC--;
                }
            }
        }
        numC = 0;
        for (int i : array) {
            if (num == i) {
                numC++;
            }
        }
        if (numC >= array.length / 2 + 1) {
            return num;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int i = MoreThanHalfNum_MySolution(new int[]{1});
        System.out.println(i);
    }
}
