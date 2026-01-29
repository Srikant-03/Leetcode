1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int n = s.length();
4        int maxLength = 0;
5        int[] charIndex = new int[128];
6        Arrays.fill(charIndex, -1);
7        int left = 0;
8        
9        for (int right = 0; right < n; right++) {
10            if (charIndex[s.charAt(right)] >= left) {
11                left = charIndex[s.charAt(right)] + 1;
12            }
13            charIndex[s.charAt(right)] = right;
14            maxLength = Math.max(maxLength, right - left + 1);
15        }
16        
17        return maxLength;
18    }
19}