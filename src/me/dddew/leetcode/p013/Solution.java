package me.dddew.leetcode.p013;


public class Solution {

    public int romanToInt(String s) {
        int ans = 0;

        for(int i = s.length() - 1; i >= 0; i--) {

            if(s.charAt(i) == 'I') {
                ans += 1;
            } else if(s.charAt(i) == 'X') {

                if(i > 0 && s.charAt(i-1) == 'I') {
                    ans += 9;
                    i--;
                } else {
                    ans += 10;
                }
            } else if(s.charAt(i) == 'C') {

                if(i > 0 && s.charAt(i-1) == 'X') {
                    ans += 90;
                    i--;
                } else {
                    ans += 100;
                }
            } else if(s.charAt(i) == 'M') {

                if(i > 0 && s.charAt(i-1) == 'C') {
                    ans += 900;
                    i--;
                } else {
                    ans += 1000;
                }
            } else if(s.charAt(i) == 'V') {

                if(i > 0 && s.charAt(i-1) == 'I') {
                    ans += 4;
                    i--;
                } else {
                    ans += 5;
                }
            } else if(s.charAt(i) == 'L') {

                if(i > 0 && s.charAt(i-1) == 'X') {
                    ans += 40;
                    i--;
                } else {
                    ans += 50;
                }
            } else if(s.charAt(i) == 'D') {

                if(i > 0 && s.charAt(i-1) == 'C') {
                    ans += 400;
                    i--;
                } else {
                    ans += 500;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().romanToInt("DCXXI"));
    }
}
