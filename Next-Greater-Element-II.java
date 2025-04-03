class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        Arrays.fill(answer, -1);
        
        for (int i = 0; i < n; i++) {
            answer[i] = findNextGreater(nums, i);
        }
        
        return answer;
    }

    private int findNextGreater(int[] nums, int index) {
        int n = nums.length;
        for (int j = 1; j < n; j++) { 
            int nextIndex = (index + j) % n;
            if (nums[nextIndex] > nums[index]) {
                return nums[nextIndex];
            }
        }
        return -1; // No greater element found
    }
}