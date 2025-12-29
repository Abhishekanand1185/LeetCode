class Solution {
    public int lengthOfLIS(int[] nums) {
        int ans = 0;
        int n = nums.length;
        int dp[] = new int[n];
        for(int i=0; i<n; i++){
            int low = 0;
            int high = ans;
            while(low < high){
                int mid = low+(high-low)/2;
                if(dp[mid] < nums[i]){
                    low = mid+1;
                }
                else{
                    high = mid;
                }
            }
            dp[low] = nums[i];
            if(low == ans){
                ans++;
            }
        }
    return ans;
    }
}