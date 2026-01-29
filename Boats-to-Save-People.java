1class Solution {
2    public int numRescueBoats(int[] people, int limit) {
3        int boats = 0;
4        Arrays.sort(people);
5        int i=0,j=people.length-1;
6        while(i<=j){
7            if((people[j]+people[i])<=limit){
8                i++;
9            }
10            j--;
11            boats++;
12        }
13        return boats;
14    }
15}