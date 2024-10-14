class Solution {
    public int cherryPickup(int[][] grid) {
        int row1 = grid.length;
        int col1 = grid[0].length;
        int row2 = grid.length;
        int col2 = grid[0].length;

         int dp[][][][] = new int[row1][col1][row2][col2];
         int res = cherryPickupHelper(grid, 0, 0, 0, 0, dp);
         if(res<0){
            return 0;
         }
         return res;
         
    }
    public static int cherryPickupHelper(int grid[][], int row1, int col1, int row2, int col2, int dp[][][][]){

          if(row1 >= grid.length || row2 >= grid.length || 
           col1 >= grid.length || col2 >= grid.length){
            return Integer.MIN_VALUE;
          }
        
          if(grid[row1][col1] == -1 || grid[row2][col2] == -1){
            return Integer.MIN_VALUE;
          }

          if(row1 == grid.length-1 && col1 == grid[0].length-1 
          && row1 == grid.length-1 && col1 == grid[0].length-1){
            return grid[row1][col1];
          }

          if(dp[row1][col1][row2][col2] != 0){
            return dp[row1][col1][row2][col2];
          }
          int path1 = cherryPickupHelper(grid, row1, col1+1, row2, col2+1, dp);
          int path2 = cherryPickupHelper(grid, row1, col1+1, row2+1, col2, dp);
          int path3 = cherryPickupHelper(grid, row1+1, col1, row2, col2+1, dp);
          int path4 = cherryPickupHelper(grid, row1+1, col1, row2+1, col2, dp);

          int ans = Math.max(Math.max(path1, path2),Math.max(path3, path4));
          int contri = 0;

          if(row1 == row2 && col1 == col2){
            contri = grid[row1][col1];
          }
          else{
            contri = grid[row1][col1] + grid[row2][col2];
          }

          dp[row1][col1][row2][col2] = ans + contri;
          return ans + contri;
    }
}