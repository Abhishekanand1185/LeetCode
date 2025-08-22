class Solution {
    public int minimumArea(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        int maxRow = -1;
        int maxCol = -1;
        int minRow = grid.length;
        int minCol = grid[0].length;
       for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(grid[i][j] == 1){
                    maxRow = Math.max(i, maxRow);
                    maxCol = Math.max(j, maxCol);
                    minRow = Math.min(i, minRow);
                    minCol = Math.min(j, minCol);
                }
            }
       } 
       int ans = (maxCol - minCol + 1) * (maxRow - minRow + 1);
    return ans;
    }
}