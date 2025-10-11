class Solution {
    private int n;
    private Map<Long, Long> freq;

    private long solve(int i, List<Long> nums, long dp[]) {
        if (i >= n)
            return 0;

        if (dp[i] != -1)
            return dp[i];

        long skip = solve(i + 1, nums, dp);

        int j = lowerBound(nums, i + 1, nums.get(i) + 3);
        long take = nums.get(i) * freq.get(nums.get(i)) + solve(j, nums, dp);

        return dp[i] = Math.max(skip, take);
    }

    private int lowerBound(List<Long> nums, int start, long target) {
        int low = start, high = nums.size();
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums.get(mid) < target)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }

    public long maximumTotalDamage(int[] power) {
        freq = new HashMap<>();
        for (int x : power)
            freq.put((long)x, freq.getOrDefault((long)x, 0L) + 1);

        List<Long> nums = new ArrayList<>(freq.keySet());
        Collections.sort(nums);
        n = nums.size();
        long[] dp = new long[n];
        Arrays.fill(dp, -1);

        return solve(0, nums, dp);
    }
}