class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp[] = new int[1001];
        Arrays.fill(dp, -1);
        return Math.min(helper(0, cost, dp), helper(1, cost, dp));
    }
    public int helper(int idx, int cost[], int dp[]){
        int n = cost.length;
        if(idx >= n){
            return 0;
        }
        if(dp[idx]  != -1){
            return dp[idx];
        }
        int a = cost[idx] + helper(idx + 1, cost, dp);
        int b = cost[idx] + helper(idx + 2, cost, dp);
        
        dp[idx] = Math.min(a,b);
        return Math.min(a,b);
    }
}