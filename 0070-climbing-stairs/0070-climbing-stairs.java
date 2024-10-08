class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        int ans = climbStairsHelper(n, dp);
        return ans;
    }

    public static int climbStairsHelper(int n, int dp[]){
        if(n==1 || n==2){
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        
        int step1 = climbStairsHelper(n-1, dp);
        int step2 = climbStairsHelper(n-2, dp);
        dp[n] = step1+step2;
        return step1+step2;
    }
}