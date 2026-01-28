1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3
4        // Result list to store grouped anagrams
5        List<List<String>> res = new ArrayList<>();
6
7        // Map to group strings by their sorted form
8        Map<String, List<String>> map = new HashMap<>();
9
10        // Iterate through each string in the input array
11        for (String str : strs) {
12
13            // Convert string to char array
14            char[] chars = str.toCharArray();
15
16            // Sort characters to form the key
17            Arrays.sort(chars);
18
19            // Convert sorted char array back to string
20            String key = new String(chars);
21
22            // If key does not exist, initialize a new list
23            if (!map.containsKey(key)) {
24                map.put(key, new ArrayList<>());
25            }
26
27            // Add the original string to its anagram group
28            map.get(key).add(str);
29        }
30
31        // Add all grouped anagrams to the result list
32        for (List<String> group : map.values()) {
33            res.add(group);
34        }
35
36        return res;
37    }
38}