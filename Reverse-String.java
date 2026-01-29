1class Solution {
2    public void reverseString(char[] s) {
3        int i = 0;
4        int j = s.length - 1;
5        
6        while(i <= j){
7            char temp = s[i];
8            s[i] = s[j];
9            s[j] = temp;
10            i++;
11            j--;
12        }
13    }
14}