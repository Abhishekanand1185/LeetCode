class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        int[] dp1 = new int[n]; 
        int[] dp2 = new int[n]; 
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        int idx0 = helper(nums, 0, n-1, dp1);
        int idx1 = helper(nums, 1, n, dp2);

        return Math.max(idx0, idx1);
    }

    public int helper(int nums[], int i, int n, int dp[]){
        if(i >= n){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        int steal = nums[i] + helper(nums, i+2, n, dp);
        int skip = helper(nums, i+1, n, dp);

        dp[i] = Math.max(steal, skip);
        return dp[i];
    }
}