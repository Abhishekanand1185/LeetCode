class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int counter = 1;
    for(int i=nums.length-1; i>0; i--){
       if(nums[i]!=nums[i-1]){
        counter++;
       }
       if(counter==3){
        return nums[i-1];
       }
     }
     return nums[nums.length-1];
    }
}