package me.dddew.leetcode.p145;

import me.dddew.leetcode.TreeNode;

import java.util.*;

/**
 * @author miareko
 * @date 2020-10-28
 */
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        Set<TreeNode> visited = new HashSet<>();
        while (node != null || !stack.isEmpty()) {
            if (node != null && !visited.contains(node)) {
                stack.push(node);
                node = node.left;
            } else {
                TreeNode t = stack.pop();
                node = t.right;
                if (node == null) {
                    res.add(t.val);
                    visited.add(t);
                } else if (!visited.contains(node)) {
                    stack.push(t);
                } else {
                    res.add(t.val);
                    visited.add(t);
                    node = null;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println(new Solution().postorderTraversal(root));
        System.out.println(Integer.MAX_VALUE);
    }
}
