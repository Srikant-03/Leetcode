public class Solution {

    static Map<Integer, Integer> memo = new HashMap<>();

    public static int climbStairs(int n) {
        
        if (n <= 2)
            return n;

        
        if (memo.containsKey(n))
            return memo.get(n);

        
        int result = climbStairs(n - 1) + climbStairs(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Ways to climb " + n + " stairs: " + climbStairs(n));
    }
}