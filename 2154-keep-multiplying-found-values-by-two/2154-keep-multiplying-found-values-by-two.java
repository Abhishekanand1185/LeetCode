class Solution {
    public int findFinalValue(int[] nums, int original) {
        int res = original;
        for(int i=0; i<nums.length;){
            if(nums[i] == res){
               res *= 2;
               i = 0;
            }
            else{
                i++;
            }
        }
    return res;
    }
}