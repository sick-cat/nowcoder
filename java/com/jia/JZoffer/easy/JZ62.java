package jia.JZoffer.easy;

import java.util.List;
import java.util.Stack;

/**
 * @author JiaYanZhao
 * @date 2021/2/5 13:45
 * <p>
 * 二叉搜索树的第k个节点（树）
 * <p>
 * 题目描述
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。
 */
public class JZ62 {
    public static void main(String[] args) {
        char[] charArr = new char[]{'5', '3', '7', '2', '4', '6', '8'};
        TreeNode root = TreeNode.arr2Tree(charArr);
        List<Character> characters = TreeNode.inorderTraversal(root);
        System.out.println(characters);
    }

    TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot == null || k <= 0){
            return null;
        }
        // 中序遍历结果
        Stack<TreeNode> stack = new Stack<>();
        int num = 0;
        do {
            if (pRoot != null) {
                stack.push(pRoot);
                pRoot = pRoot.left;
            } else {
                pRoot = stack.pop();
                num++;
                if (num == k){
                    return pRoot;
                }
                pRoot = pRoot.right;
            }
        } while (pRoot != null || !stack.isEmpty());
        return null;
    }
}
