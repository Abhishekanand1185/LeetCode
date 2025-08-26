class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiagSq = 0;
        int ans = 0;
        for(int i=0; i<dimensions.length; i++){
            int length = dimensions[i][0];
            int width = dimensions[i][1];
            int diagSq = (length*length) + (width * width);
            if (diagSq > maxDiagSq || (diagSq == maxDiagSq && length * width > ans)) {
                maxDiagSq = diagSq;
                ans = length * width;
            }
        }
    return ans;
    }
}