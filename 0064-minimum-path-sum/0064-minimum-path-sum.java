class Solution {
    public static int minPathSumHelper(int [][] grid, int m, int n, int dp[][]){

        if (m < 0 || n < 0){
            return Integer.MAX_VALUE;
        }
        if (m == 0 && n == 0){
            return grid[m][n];
        }
        if(dp[m][n] != -1){
            return dp[m][n];
        }
      
        int path1 = minPathSumHelper(grid, m-1, n, dp);
        int path2 = minPathSumHelper(grid, m, n-1, dp);
        
        dp[m][n] = Math.min(path1, path2) + grid[m][n];
        return Math.min(path1, path2) + grid[m][n];

    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int [m][n];
        for(int i = 0; i < m; i++ ){
            Arrays.fill(dp[i], -1);
        }
        int res = minPathSumHelper(grid, m-1, n-1, dp);
        return res;        
    }
}