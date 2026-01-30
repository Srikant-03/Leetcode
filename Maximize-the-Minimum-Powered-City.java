1class Solution {
2    public long maxPower(int[] stations, int r, int k) {
3        int n = stations.length;
4
5        // 1) Build prefix sum
6        long[] pref = new long[n + 1];
7        for (int i = 0; i < n; i++) {
8            pref[i + 1] = pref[i] + stations[i];
9        }
10
11        // 2) Compute initial power for each city
12        long[] power = new long[n];
13        for (int i = 0; i < n; i++) {
14            int left = Math.max(0, i - r);
15            int right = Math.min(n - 1, i + r);
16            power[i] = pref[right + 1] - pref[left];
17        }
18
19        // Binary search for maximum possible minimum power
20        long low = 0, high = (long) 1e18, ans = 0;
21        while (low <= high) {
22            long mid = (low + high) / 2;
23            if (can(power, r, k, mid)) {
24                ans = mid;
25                low = mid + 1;
26            } else high = mid - 1;
27        }
28        return ans;
29    }
30
31    private boolean can(long[] power, int r, long k, long target) {
32        int n = power.length;
33        long[] diff = new long[n];
34        long added = 0, used = 0;
35
36        for (int i = 0; i < n; i++) {
37            added += diff[i];
38            long curr = power[i] + added;
39
40            if (curr < target) {
41                long need = target - curr;
42                used += need;
43                if (used > k) return false;
44
45                added += need;
46                int end = i + 2 * r + 1;
47                if (end < n) diff[end] -= need;
48            }
49        }
50        return true;
51    }
52}
53