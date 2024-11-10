class Solution {
    public int minimumOperations(int[] nums) {
        int countDivBy3 = 0, countNotDivBy3 = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] % 3 == 0){
                countDivBy3 ++;
            }
            else{
                countNotDivBy3 ++;
            }
        }
    return nums.length == countDivBy3 ? 0 : countNotDivBy3;
    }
}