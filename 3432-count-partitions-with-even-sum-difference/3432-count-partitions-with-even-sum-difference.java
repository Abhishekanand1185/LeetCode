class Solution {
    public int countPartitions(int[] nums) {
        int totalSum = 0, leftSum = 0;
        for(int num : nums){
            totalSum += num;
        }

        if(totalSum % 2 == 1) return 0;

        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) { 
            leftSum += nums[i]; 
            int rightSum = totalSum - leftSum; 
  
            if ((leftSum % 2) == (rightSum % 2)) {
                count++; 
            }
        }
        return count; 

    }
}