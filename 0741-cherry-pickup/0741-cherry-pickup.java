class Solution {
    public int cherryPickup(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][][] = new int[m][n][m];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                Arrays.fill(dp[i][j], -1);
            }
        }
        int ans = cherryPickupHelper(grid, 0, 0, 0, dp);
        if(ans == Integer.MIN_VALUE){
            return 0;
        }
        return ans;
    }
    public int cherryPickupHelper(int grid[][], int row1, int col1, int row2, int dp[][][]){
        int col2 = row1+col1-row2;
        int m = grid.length;
        int n = grid[0].length;
        if (row1 >= m || col1 >= n || row2 >= m || col2 >= n ||
            grid[row1][col1] == -1 || grid[row2][col2] == -1) {
            return Integer.MIN_VALUE;
        }
        if((row1 == m - 1 && col1 == n - 1) && (row2 == m - 1 && col2 == n - 1)) {
             return grid[row1][col1];
        }

        if(dp[row1][col1][row2] != -1){
            return dp[row1][col1][row2];
        }

        int path1 = cherryPickupHelper(grid, row1, col1+1, row2, dp);
        int path2 = cherryPickupHelper(grid, row1, col1+1, row2+1, dp);
        int path3 = cherryPickupHelper(grid, row1+1, col1, row2,dp);
        int path4 = cherryPickupHelper(grid, row1+1, col1, row2+1, dp);

        int max = Math.max(Math.max(path1, path2), Math.max(path3, path4));
        if(max == Integer.MIN_VALUE){
            dp[row1][col1][row2] = Integer.MIN_VALUE;
            return Integer.MIN_VALUE;
        }
        int cherryContri = 0;
        if(row1 == row2 && col1 == col2){
            cherryContri = grid[row1][col1];
        }
        else{
            cherryContri = grid[row1][col1] + grid[row2][col2];
        }
        dp[row1][col1][row2] = max+cherryContri;
        return max+cherryContri;
    }
}