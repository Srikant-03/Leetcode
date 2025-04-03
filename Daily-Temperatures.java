class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n]; 
        
        for (int i = n - 2; i >= 0; i--) { 
            int j = i + 1; 
            
            while (j < n && temperatures[j] <= temperatures[i]) {
                if (answer[j] == 0) break; 
                j += answer[j]; 
            }
            
            if (j < n && temperatures[j] > temperatures[i]) {
                answer[i] = j - i; 
            }
        }
        
        return answer;
    }
}

    