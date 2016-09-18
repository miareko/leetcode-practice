## Wildcard Matching

[https://leetcode.com/problems/regular-expression-matching/](https://leetcode.com/problems/regular-expression-matching/)



<br>

### 解题思路

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;用dp[i,j]表示s的前i个字符与p的前j个字符是否匹配，显然对于dp[i,j]可以由dp[i-m,j-n]求得，故该题可用动态规划求解，分如下几种情况：

1.	当p[j-1] **!=** '*'时，dp[i,j] = dp[i-1,j-1] && (s[i-1] == p[j-1] || p[j-1] == '.')
2.	当p[j-1] **==** '*'时

	- 若p[j-2] **==** '.'，则dp[i,j] = dp[0,j-2] || dp[1,j-2] || …… || dp[i,j-2]
	- 若p[j-2] **!=** '.'，则dp[i,j] = dp[k,j-2] && s[k] == p[j-2] && s[k+1] == p[j-2] && …… && s[i-1] == p[j-2] （0<=k<i）

值得注意的是，dp[i,j]表示s的前i个字符与p的前j个字符，而不是数组下标。故有初始状态dp[0,0] = true， dp[0,k] = dp[0,k-2] && p[i-1] == '*'