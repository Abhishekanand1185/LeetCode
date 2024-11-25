class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int prefixMax[] = new int[n];
        prefixMax[0] = height[0];
        for(int i=1; i<n; i++){
            prefixMax[i]=Math.max(prefixMax[i-1], height[i]);
        }
        int suffixMax[] = new int[n];
        suffixMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            suffixMax[i] = Math.max(suffixMax[i+1], height[i]);
        }
        int ans = 0;
        for(int i=1; i<n-1; i++){
            int contri = Math.min(prefixMax[i-1], suffixMax[i+1]) - height[i];
            if(contri > 0){
                ans+=contri;
            }
        }
    return ans;
    }
}