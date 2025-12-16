class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int dir = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0, top = 0;
        int right = col-1;
        int bottom = row-1;
        while(left <= right && top <= bottom){
            if(dir == 0){
                for(int i = left; i <= right; i++){
                    res.add(matrix[top][i]);
                }
                top ++;
            }
            if(dir == 1){
                for(int i = top; i <= bottom; i++){
                    res.add(matrix[i][right]);
                }
                right --;
            }
            if(dir == 2){
                for(int i = right; i >=  left; i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(dir == 3){
                for(int i = bottom; i >=top; i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
            dir = ( dir + 1 ) % 4;
        }
    return res;
    }
}