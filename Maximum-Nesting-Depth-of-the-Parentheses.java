class Solution {
    public int maxDepth(String s) {
           Stack<Character> stack = new Stack<>();
        int maxDepth = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
                maxDepth = Math.max(maxDepth, stack.size()); // Update max depth
            } else if (c == ')') {
                stack.pop();
            }
        }

        return maxDepth;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        System.out.println(solution.maxDepth("(1+(2*3)+((8)/4))+1")); 
        System.out.println(solution.maxDepth("(1)+((2))+(((3)))"));   
        System.out.println(solution.maxDepth("()(())((()()))"));       
    }
}