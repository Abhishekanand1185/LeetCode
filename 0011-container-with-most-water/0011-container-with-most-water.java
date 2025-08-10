class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int ans = Integer.MIN_VALUE;
        while(i<j){
            int wt = (j-i) * Math.min(height[i], height[j]);
            ans = Math.max(ans, wt);
            if(height[i] <= height[j]){
                i++;
            } else{
                j--;
            }
        }
    return ans;
    }
}