class Solution {
    public int maxSubArray(int[] nums) {
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(currsum<0){
                currsum=0;
            }
            currsum+=nums[i];
            maxsum=Math.max(currsum,maxsum);
        }
        return maxsum;
    }
}