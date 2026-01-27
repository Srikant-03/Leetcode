1class Solution {
2    public int maximumPopulation(int[][] logs) {
3        int[] count = new int[101];
4
5        for (int[] arr : logs) {
6            count[arr[0] - 1950]++;
7            count[arr[1] - 1950]--;
8        }
9
10        int population = 0;
11        int year = 0;
12        int max = 0;
13
14        for (int i = 0; i < 100; i++) {
15
16            population += count[i];
17
18            if (population > max) {
19                max = population;
20                year = i + 1950;
21            }
22        }
23
24        return year;
25    }
26}