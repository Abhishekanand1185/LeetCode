class Solution {
    public int rob(int[] nums) {
        int prev = nums[0];
        int prev2 = 0;
        for(int i=1; i<nums.length; i++){
        int pick = nums[i];
          if(i>1){
            pick+=prev2;
          }
          int nonpick = prev;
          int currI = Math.max(pick,nonpick);
          prev2=prev;
          prev=currI;
        }
        return prev;
    }
}