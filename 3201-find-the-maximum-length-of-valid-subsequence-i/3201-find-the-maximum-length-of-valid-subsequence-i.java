class Solution {
    public int maximumLength(int[] nums) {
        int oddcount = 0;
        int evencount = 0;
        int pair = 0;
        int c = nums[0] % 2;
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                evencount++;
            } else{
                oddcount++;
            }
            if(nums[i] % 2 == c){
                pair++;
                c = 1-c;
            }
        }
        int ans = Math.max(Math.max(oddcount, evencount), pair);
    return ans;
    }
}