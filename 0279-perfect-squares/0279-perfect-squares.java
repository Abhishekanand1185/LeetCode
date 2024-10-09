class Solution {
    public int numSquares(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        int ans = numSquaresHelper(n, dp);
        return ans;
    }

    public static int numSquaresHelper(int n, int dp[]){
        int min = Integer.MAX_VALUE;
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }

        for(int i=1; i*i<=n; i++){
            int temp = numSquaresHelper(n - i*i, dp);
            min = Math.min(temp,min);
        }
        dp[n] = min+1;
        return min+1;
    }
}