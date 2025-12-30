class Solution {
    public int numMagicSquaresInside(int[][] grid) {
       int rows = grid.length;
       int cols = grid[0].length;
       int res = 0; 
       for(int row = 0; row <= rows-3; row++){
        for(int col = 0; col <= cols-3; col++){
            if(isMagicSquare(grid, row, col)){
                res++;
            }
        }
       }
    return res;
    }
    public boolean isMagicSquare(int grid[][], int row , int col){
        HashSet<Integer> hs = new HashSet<>();
        //Check all unique values in the matrix
        for(int r = 0; r < 3; r++){
            for(int c = 0; c < 3; c++){
                int num = grid[row + r][col+c];
                if( num < 1 || num > 9 || hs.contains(num)){
                    return false;
                }
                hs.add(num);
            }
        }

        int sum = grid[row][col] + grid[row][col+1] + grid[row][col+2];

        // check for Digonal sum

        //Diagonal 1 sum
        if(grid[row][col] + grid[row+1][col+1] + grid[row+2][col+2] != sum){
            return false;
        }

        //Diagonal 2 sum
        if(grid[row][col+2] + grid[row+1][col+1] + grid[row+2][col] != sum){
            return false;
        }

        for(int i = 0; i<3; i++){
            //row sum
            if(grid[row+i][col] + grid[row+i][col+1] + grid[row+i][col+2] != sum){
                return false;
            }

            //col sum
            if(grid[row][col+i] + grid[row+1][col+i] + grid[row+2][col+i] != sum){
                return false;
            }
        }
    return true;
    }
}