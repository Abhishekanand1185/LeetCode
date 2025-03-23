class NumMatrix {
    int pSum[][];
    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        pSum = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(j==0){
                    pSum[i][j] = matrix[i][j];
                }
                else{
                    pSum[i][j] = pSum[i][j-1] + matrix[i][j];
                }
            }
        }
        for(int j=0; j<n; j++){
            for(int i=1; i<m; i++){
                pSum[i][j] = pSum[i-1][j] + pSum[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans = 0;
        ans  += pSum[row2][col2];
        if(row1-1 >= 0){
            ans -= pSum[row1-1][col2];
        }
        if(col1-1 >= 0){
            ans -= pSum[row2][col1-1];
        }
        if(row1-1 >= 0 && col1-1 >= 0){
            ans += pSum[row1-1][col1-1];
        }
     return ans;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */