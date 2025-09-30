class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
        for(int i=0; i<m; i++){
            Arrays.fill(dp[i], -1);
        }
        return helper(grid, m-1, n-1, dp);
    }
    public int helper(int [][] arr, int i, int j, int dp[][]){
       if(i < 0 || j < 0) return Integer.MAX_VALUE;
       if(i == 0 && j == 0) return arr[i][j];
       if(dp[i][j] != -1) return dp[i][j];
       int path1 = helper(arr, i - 1, j, dp);
       int path2 = helper(arr, i, j - 1, dp);
       dp[i][j] = Math.min(path1, path2) + arr[i][j];
       return Math.min(path1, path2) + arr[i][j];
    }
}