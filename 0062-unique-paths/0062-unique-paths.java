class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for(int i=0; i<m; i++){
            Arrays.fill(dp[i], -1);
        }
        int res = uniquePathsHelper(m-1,n-1,dp);
        return res;
    }

    public static int uniquePathsHelper(int m, int n, int dp[][]){
        if (m==0 || n==0){
            return 1;
        }
        if(dp[m][n] != -1){
            return dp[m][n];
        }
        int bottom = uniquePathsHelper(m-1, n, dp);
        int right = uniquePathsHelper(m, n-1, dp);
        
        dp[m][n] = bottom + right;
        return bottom + right;

    }
}