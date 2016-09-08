package me.dddew.leetcode.p012;

public class Solution {

    public String intToRoman(int num) {

        StringBuilder ans = new StringBuilder();

        int m = 0, c = 0, x = 0;

        while(num >= 1000 && m < 3) {
            m++;
            num -= 1000;
            ans.append('M');
        }

        if(num >= 900) {
            num -= 900;
            ans.append("CM");
        }

        if(num >= 500) {
            num -= 500;
            ans.append('D');
        }

        if(num >= 400) {
            num -= 400;
            ans.append("CD");
        }

        while(num >= 100 && c < 3) {
            c++;
            num -= 100;
            ans.append('C');
        }

        while(num >= 90) {
            num -= 90;
            ans.append("XC");
        }

        if(num >= 50) {
            num -= 50;
            ans.append('L');
        }

        if(num >= 40) {
            num -= 40;
            ans.append("XL");
        }

        while(num >= 10 && x < 3) {
            x++;
            num -= 10;
            ans.append('X');
        }

        if(num >= 9) {
            num -= 9;
            ans.append("IX");
        }

        if(num >= 5) {
            num -= 5;
            ans.append('V');
        }

        if(num >= 4) {
            num -= 4;
            ans.append("IV");
        }

        while(num >= 1) {
            num--;
            ans.append('I');
        }
        return ans.toString();

    }

    public static void main(String[] args) {
        System.out.println(new Solution().intToRoman(954));
    }
}
