class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][]= new int[m+1][n+1];
        for(int i=0; i<m; i++){
            Arrays.fill(dp[i], -1);
        }
        return helper(obstacleGrid, m-1, n-1, dp);
    }
    public int helper(int[][] arr, int i, int j,int dp[][]){
        if(i<0 || j<0 || arr[i][j] == 1){
            return 0;
        }
        if(i == 0 && j == 0){
            return 1;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int path1 = helper(arr, i-1, j, dp);
        int path2 = helper(arr, i, j-1, dp);

        dp[i][j] = path1+path2;
        return path1+path2;
    }
}