class Solution {
    public int subarraySum(int[] nums, int k) {
       Map <Integer, Integer> a = new HashMap<>();
       a.put(0,1);
       int sum = 0;
       int count = 0;
       for (int i = 0; i < nums.length;i++){
       sum +=  nums[i];
       int x = sum-k;
       count += a.getOrDefault(x,0);
       a.put(sum,a.getOrDefault(sum,0)+1);
    }
    return count;
    }
}
