class Solution {
    public int maximumLength(int[] nums) {
        int oddcount = 0;
        int evencount = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                evencount++;
            } else{
                oddcount++;
            }
        }
        boolean odd = false;
        boolean even = false;
        if(nums[0] % 2==0){
            even = true;
        }else {
            odd = true;
        }
        int ans = 1;

        for(int i=1; i<nums.length; i++){
                if(nums[i] % 2 == 0){
                    if(odd){
                       ans++;
                       even = true;
                       odd = false;
                    } 
                }
                else{
                    if(even){
                       ans++;
                       odd = true;
                       even = false;
                    }
                }
        }
        ans = Math.max(Math.max(oddcount, evencount), ans);
    return ans;
    }
}