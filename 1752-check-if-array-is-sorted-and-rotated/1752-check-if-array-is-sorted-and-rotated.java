class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int counter = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]>nums[i]){
                counter++;
            }
        }
        if(nums[0]<nums[n-1]){
            counter++;
        }
        return counter<=1?true:false;
    }
}