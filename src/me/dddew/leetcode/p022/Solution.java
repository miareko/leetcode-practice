package me.dddew.leetcode.p022;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> generateParenthesis(int n) {

        List<String> results = new ArrayList<>();

        if(n > 0) {
            char[] parentheses = new char[2*n];
            parentheses[0] = '(';
            dfs(results, parentheses, 1, n - 1, 1, 2*n);

        }
        return results;
    }

    /**
     *
     * @param results       结果集合
     * @param parentheses   存储当前所选括号的临时数组
     * @param left          待匹配的左括号数量
     * @param remain        剩下的左括号数量
     * @param index         当前决策位置
     * @param length        单个结果字符串总长度
     */
    public void dfs(List<String> results, char[] parentheses, int left, int remain, int index, int length) {

        if(index >= length) {
            results.add(new String(parentheses));
            return;
        }

        if(remain > 0) {
            parentheses[index] = '(';
            dfs(results, parentheses, left + 1, remain - 1, index + 1, length);
        }

        if(left > 0) {
            parentheses[index] = ')';
            dfs(results, parentheses, left - 1, remain, index + 1, length);
        }
    }

    public static void main(String[] args) {
        new Solution().generateParenthesis(4).forEach(System.out::println);
    }
}
