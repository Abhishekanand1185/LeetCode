class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i=0; i<32; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                int n = nums[j];
                if(((n>>i) & 1) == 1){
                    count++;
                }
            }
            if((count % 3) != 0){
                ans += 1<<i;
            }
        }
    return ans;
    }
}