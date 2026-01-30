1class Solution {
2    public int islandPerimeter(int[][] grid) {
3        int perimeter = 0;
4
5        for (int i = 0; i < grid.length; i++) {
6            for (int j = 0; j < grid[0].length; j++) {
7                if (grid[i][j] == 1) {
8                    perimeter += 4;
9
10                    // check top
11                    if (i > 0 && grid[i - 1][j] == 1) {
12                        perimeter -= 2;
13                    }
14
15                    // check left
16                    if (j > 0 && grid[i][j - 1] == 1) {
17                        perimeter -= 2;
18                    }
19                }
20            }
21        }
22        return perimeter;
23    }
24}