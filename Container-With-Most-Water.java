1class Solution {
2    public int maxArea(int[] height) {
3        int i = 0;
4        int j = height.length - 1;
5        int res = 0;
6
7        while (i < j) {
8            res = Math.max(res, (j - i) * Math.min(height[i], height[j]));
9            if (height[i] < height[j]) i++;
10            else j--;
11        }
12
13        return res;
14    }
15}
16