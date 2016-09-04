## Container With Most Water

[https://leetcode.com/problems/container-with-most-water/](https://leetcode.com/problems/container-with-most-water/)

Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

<br>

### 解题思路

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;由ai和aj（i<j）组成的容器面积，S(i,j)=min(ai,aj)*(j-i)。
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;对于ai'和aj'（ai<=ai'且aj'<=aj）,若S(i',j')>=S(i,j)，则min(ai',aj')>=min(ai,aj)，因此可以采取头尾指针向中间双向移动的方法。若ai<aj，则左侧指针右移（因为此时若aj左移与ai组成的容器面积总小于ai与aj所组成的容器面积）；同理ai>aj，右侧指针左移；而ai=aj时，两侧指针同时向中间移动。重复以上过程直到左侧指针不小于右侧指针为止。