class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxSum = nums[0], currMax = 0;
        int minSum = nums[0], currMin = 0;

        for (int num : nums) {
            totalSum += num;

            currMax = Math.max(num, currMax + num);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(num, currMin + num);
            minSum = Math.min(minSum, currMin);
        }

        if (totalSum == minSum) {
            return maxSum;
        }

        return Math.max(maxSum, totalSum - minSum);
    }
}