class Solution {
    public int differenceOfSum(int[] nums) {
        int numSum = 0, digitSum = 0;
        for(int i=0; i<nums.length; i++){
            numSum += nums[i];
        }
        for(int i=0; i<nums.length; i++){
            while(nums[i] != 0){
                int r = nums[i] % 10;
                digitSum += r;
                nums[i] /= 10;
            }
        }
    return Math.abs(numSum - digitSum);
    }
}