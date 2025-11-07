class Solution {
    public long maxPower(int[] stations, int r, int k) {
        int n = stations.length;

        // 1) Build prefix sum
        long[] pref = new long[n + 1];
        for (int i = 0; i < n; i++) {
            pref[i + 1] = pref[i] + stations[i];
        }

        // 2) Compute initial power for each city
        long[] power = new long[n];
        for (int i = 0; i < n; i++) {
            int left = Math.max(0, i - r);
            int right = Math.min(n - 1, i + r);
            power[i] = pref[right + 1] - pref[left];
        }

        // Binary search for maximum possible minimum power
        long low = 0, high = (long) 1e18, ans = 0;
        while (low <= high) {
            long mid = (low + high) / 2;
            if (can(power, r, k, mid)) {
                ans = mid;
                low = mid + 1;
            } else high = mid - 1;
        }
        return ans;
    }

    private boolean can(long[] power, int r, long k, long target) {
        int n = power.length;
        long[] diff = new long[n];
        long added = 0, used = 0;

        for (int i = 0; i < n; i++) {
            added += diff[i];
            long curr = power[i] + added;

            if (curr < target) {
                long need = target - curr;
                used += need;
                if (used > k) return false;

                added += need;
                int end = i + 2 * r + 1;
                if (end < n) diff[end] -= need;
            }
        }
        return true;
    }
}
