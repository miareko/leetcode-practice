package me.dddew.leetcode.p029;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @author miareko
 * @date 2020-05-31
 */
public class Solution {

    public int divide(int dividend, int divisor) {
        if (dividend == 0 || divisor == 1) {
            return dividend;
        }
        if (dividend == 0x80000000 && divisor == -1) {
            return 0x7fffffff;
        }
        boolean negative = dividend > 0 ^ divisor > 0;
        if (dividend > 0) {
            dividend = -dividend;
        }
        if (divisor > 0) {
            divisor = -divisor;
        }
        int result = 0;
        while (dividend <= divisor) {
            int tmpDivisor = divisor;
            int r = -1;
            while (dividend <= (tmpDivisor << 1)) {
                if (tmpDivisor <= (Integer.MIN_VALUE >> 1)) {
                    break;
                }
                tmpDivisor <<= 1;
                r <<= 1;
            }
            dividend -= tmpDivisor;
            result += r;
        }
        return negative ? result : -result;
    }
}
