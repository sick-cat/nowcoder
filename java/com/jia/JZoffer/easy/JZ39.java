package jia.JZoffer.easy;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author JiaYanZhao
 * @date 2021/2/1 12:30
 * <p>
 * 平衡二叉树（树，dfs）
 * <p>
 * 题目描述
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * 在这里，我们只需要考虑其平衡性，不需要考虑其是不是排序二叉树
 * 平衡二叉树（Balanced Binary Tree），具有以下性质：它是一棵空树或它的左右两个子树的高度差的绝对值不超过1，并且左右两个子树都是一棵平衡二叉树。
 */
public class JZ39 {
    public static void main(String[] args) {
        char[] charArr = new char[]{'1', '2', '3', '4', '#', '#', '#', '5', '#'};
        TreeNode node = JZ38.arr2Tree(charArr);
        boolean b = IsBalanced_Solution(node);
        System.out.println(b);
    }

    /**
     * 按照 求二叉树深度 的题解，记录深度最浅的深度，如果最浅和最深的深度差值大于一，那一定不是平衡二叉树
     *
     * @param root
     * @return
     */
    public static boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        // 最浅的深度
        int firstLevel = -1;
        // 最深的深度
        int level = 1;
        while (!queue.isEmpty()) {
            // 记录当前层的节点个数
            int size = queue.size();
            // 标识整个树 是否有下一层
            int flag = 0;
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                // 标识 当前节点是否有下一层
                int currFlag = 0;
                if (poll.left != null) {
                    queue.offer(poll.left);
                    flag = 1;
                    currFlag = 1;
                }
                if (poll.right != null) {
                    queue.offer(poll.right);
                    flag = 1;
                    currFlag = 1;
                }
                // 记录最浅的 深度
                if (poll.left == null || poll.right == null) {
                    firstLevel = firstLevel < 0 ? level + flag : Math.min(firstLevel, level + currFlag);
                }
            }
            level += flag;
        }
        System.out.println("firstLevel: " + firstLevel);
        System.out.println("leve: " + level);
        if (level - firstLevel > 1) {
            return false;
        }
        return true;
    }
}
