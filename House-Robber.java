1class Solution {
2    public int rob(int[] nums) {
3        int n = nums.length;
4        if(nums == null || n == 0) return 0;
5        if (n == 1) return nums[0];
6        if (n == 2) return Math.max(nums[0], nums[1]);
7
8        int dp[] = new int[n];
9        dp[0] = nums[0];
10        dp[1] = Integer.max(nums[1], nums[0]);
11        for (int i = 2; i < n; i++) {
12            dp[i] = Integer.max(nums[i] + dp[i-2], dp[i-1]);
13        }
14        return dp[n-1];
15    }
16}