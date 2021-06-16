package jia.JZoffer.easy;

import java.util.*;

/**
 * @author JiaYanZhao
 * @date 2021/2/1 14:01
 */
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }


    /**
     * 数组转树
     */
    public static TreeNode arr2Tree(char[] charArr) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        TreeNode root = new TreeNode(charArr[0] - 48);
        queue.offer(root);
        int index = 1;
        while (queue.size() > 0 && index < charArr.length) {
            TreeNode node = queue.poll();
            if (charArr[index] != '#') {
                TreeNode tempNode = new TreeNode(charArr[index] - 48);
                node.left = tempNode;
                queue.offer(tempNode);
            }
            index++;
            if (index < charArr.length && charArr[index] != '#') {
                TreeNode tempNode = new TreeNode(charArr[index] - 48);
                node.right = tempNode;
                queue.offer(tempNode);
            }
            index++;
        }
        return root;
    }

    public static List<Character> inorderTraversal(TreeNode tree) {
        // 中序遍历结果
        List<Character> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        do {
            if (tree != null) {
                stack.push(tree);
                tree = tree.left;
            } else {
                tree = stack.pop();
                list.add((char)(tree.val + 48));
                tree = tree.right;
            }
        } while (tree != null || !stack.isEmpty());
        return list;
    }
}
