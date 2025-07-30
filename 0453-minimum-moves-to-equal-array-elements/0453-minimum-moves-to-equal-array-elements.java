class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int sum = 0 ;
        int diff = 0;
        for (int i = 0 ; i< nums.length-1 ; i++)
        {
            
            diff = (nums[i+1] + sum) - nums[i]+diff;
           
            sum = sum + diff ;
            nums[i+1] = nums[i+1] + sum ;
            System.out.println(sum);
        }

        return sum ;
    }
}