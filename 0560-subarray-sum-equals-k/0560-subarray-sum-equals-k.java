class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        for(int s=0; s<n; s++){
            int sum = 0;
            for(int e=s; e<n; e++){
                sum += nums[e];
                if(sum == k){
                    ans++;
                }
            }
        }
    return ans;
    }
}