1class Solution {
2    public int compress(char[] chars) {
3        int write = 0;  // Write position
4        int i = 0;      // Read position
5        
6        while(i < chars.length){
7            char ch = chars[i];
8            int count = 1;
9            
10            // Count consecutive characters
11            while(i + 1 < chars.length && ch == chars[i + 1]){
12                count++;
13                i++;
14            }
15            
16            i++;
17            
18            // Write character
19            chars[write++] = ch;
20            
21            // Write count if > 1 (using String.valueOf)
22            if(count > 1){
23                String countStr = String.valueOf(count);
24                for(char c : countStr.toCharArray()){
25                    chars[write++] = c;
26                }
27            }
28        }
29        
30        return write;
31    }
32}