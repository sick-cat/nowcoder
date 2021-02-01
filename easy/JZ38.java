import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author JiaYanZhao
 * @date 2021/2/1 9:18
 * <p>
 * 二叉树的深度（树）
 * <p>
 * 题目描述
 * 输入一棵二叉树，求该树的深度。
 * 从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，
 * 最长路径的长度为树的深度。
 */
public class JZ38 {
    public static void main(String[] args) {
        char[] charArr = new char[]{'1', '2', '3', '4', '5', '#', '6', '#', '#', '7'};
        TreeNode node = arr2Tree(charArr);
        int i = TreeDepth(node);
        int j = TreeDepth1(node);
        System.out.println(i + "-----" + j);
    }

    /**
     * 使用队列 一层一层遍历
     *
     * @param root
     * @return
     */
    public static int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        int level = 1;
        while (!queue.isEmpty()) {
            // 记录当前层的节点个数
            int size = queue.size();
            int flag = 0;
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (poll.left != null) {
                    queue.offer(poll.left);
                    flag = 1;
                }
                if (poll.right != null) {
                    queue.offer(poll.right);
                    flag = 1;
                }
            }
            level += flag;
        }
        return level;
    }

    /**
     * 递归实现
     *
     * @param root
     * @return
     */
    public static int TreeDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = TreeDepth1(root.left);
        int right = TreeDepth1(root.right);
        return Math.max(left, right) + 1;
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


    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }

    }
}
