class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n]; 
        
        for (int i = n - 2; i >= 0; i--) {
            answer[i] = findNextWarmerDay(temperatures, answer, i);
        }
        
        return answer;
    }

    // Helper method to find the next warmer day
    private int findNextWarmerDay(int[] temperatures, int[] answer, int i) {
        int j = i + 1;
        
        while (j < temperatures.length && temperatures[j] <= temperatures[i]) {
            if (answer[j] == 0) return 0; 
            j += answer[j]; 
        }
        
        return (j < temperatures.length) ? j - i : 0;
    }
}

    