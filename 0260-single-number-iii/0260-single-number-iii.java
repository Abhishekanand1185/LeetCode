class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int num: nums){
            xor ^= num;
        }
        int set1 = 0;
        int set2 = 0;
        int idx = 0;
        for(int i=0; i<32; i++){
            if(((xor >> i) & 1) == 1){
                idx = i;
                break;
            }
        }
        for(int i=0; i<nums.length; i++){
            int n = nums[i];
            if(((n >> idx) & 1) == 0){
                set1 ^= nums[i];
            } else{
                set2 ^= nums[i];
            }
        }
    return new int[]{set1, set2};
    }
}