class Solution {
    public int minAddToMakeValid(String s) {
               int openNeeded = 0, closeNeeded = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                openNeeded++;
            } else {
                if (openNeeded > 0) {
                    openNeeded--; 
                } else {
                    closeNeeded++; 
                }
            }
        }

        return openNeeded + closeNeeded;
    }
}
 
    
