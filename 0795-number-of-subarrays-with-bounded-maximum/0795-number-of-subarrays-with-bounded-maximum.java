class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int ans = 0, lgei = 0, prevValidCount = 0;
        int n = nums.length;
        for(int ep = 0; ep < n; ep++){
            if(nums[ep] > right){
                ans = ans + 0;
                prevValidCount = 0; 
                lgei = ep + 1;
            }

            else if(nums[ep] >= left && nums[ep] <= right){
                ans = ans + (ep - lgei + 1);
                prevValidCount = ep - lgei + 1;
            }

            else{
                ans += prevValidCount;
            }
        }
    return ans;
    }
}