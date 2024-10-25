class Solution {
    public int tribonacci(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        int dp[] = {0, 1, 1};
        int ans = 0;
        for(int i=3; i<=n; i++){
             ans = dp[0] + dp[1] + dp[2];
             dp[0] = dp[1];
             dp[1] = dp [2];
             dp[2] = ans;
        }
     return ans;
    }
}