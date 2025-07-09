class Solution {
    public int cherryPickup(int[][] grid) {
       int dp[][][] = new int[grid.length][grid[0].length][grid.length];
        for (int i = 0; i < dp.length; i++) {
        for (int j = 0; j < dp[0].length; j++) {
            Arrays.fill(dp[i][j], -1);
            }
        }
         int res = cherryPickupHelper(grid, 0, 0, 0, dp);
         if(res == Integer.MIN_VALUE){
            return 0;
        }else{
            return res;
        }
    }
    public static int cherryPickupHelper(int grid[][], int row1, int col1, int row2, int dp[][][]){
          int col2 = row1 + col1 - row2;
          if(row1 >= grid.length || row2 >= grid.length || 
           col1 >= grid[0].length || col2 >= grid[0].length
           || grid[row1][col1] == -1 || grid[row2][col2] == -1){
            return Integer.MIN_VALUE;
          }

          if(row1 == grid.length-1 && col1 == grid[0].length-1 
          && row2 == grid.length-1 && col2 == grid[0].length-1){
            return grid[row1][col1];
          }

          if(dp[row1][col1][row2] != -1){
            return dp[row1][col1][row2];
          }


          int path1 = cherryPickupHelper(grid, row1, col1+1, row2, dp);
          int path2 = cherryPickupHelper(grid, row1, col1+1, row2+1, dp);
          int path3 = cherryPickupHelper(grid, row1+1, col1, row2, dp);
          int path4 = cherryPickupHelper(grid, row1+1, col1, row2+1, dp);

          int max = Math.max(Math.max(path1, path2),Math.max(path3, path4));
          int contri = 0;
          if(row1 == row2 && col1 == col2){
            contri = grid[row1][col1];
          }
          else{
            contri = grid[row1][col1] + grid[row2][col2];
          }
          if(max == Integer.MIN_VALUE){
            dp[row1][col1][row2] = Integer.MIN_VALUE;
            return Integer.MIN_VALUE;

          }else{
             dp[row1][col1][row2] = max+contri;
             return max+contri;
          }
    }
}