class Solution {
    public int findNumbers(int[] nums) {
    //     int evenCount = 0;
    //     for(int i = 0; i < nums.length; i++){
    //         int digitCount = 0;
    //         while(nums[i] != 0){
    //             int r = nums[i] % 10;
    //             digitCount++;
    //             nums[i] /= 10;
    //         }
    //         if(digitCount % 2 == 0) evenCount++;
    //     }
    // return evenCount;

        int evenCount = 0;
        for(int num: nums){
            int digits = (int) Math.log10(num) + 1;
            if(digits % 2 == 0) evenCount++;
        }
    return evenCount;
    }
}