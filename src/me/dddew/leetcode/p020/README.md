## Valid Parentheses

[https://leetcode.com/problems/valid-parentheses/](https://leetcode.com/problems/valid-parentheses/)

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

<br>

### 解题思路

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;典型的使用压栈的方式解决的问题。遍历整个字符串，如果是左括号，则压入栈中；如果是右括号，则与栈顶元素进行匹配，能匹配就出栈，否则返回not valid。当且仅当遍历完成时栈为空才返回valid。