class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long currWsum = 0;
        long res = 0;
        HashSet<Integer> hs = new HashSet<>();
        int left = 0;
        int right = 0;
        while(right < n){
            while(hs.contains(nums[right])){
                currWsum -= nums[left];
                hs.remove(nums[left]);
                left++;
            }
            currWsum += nums[right];
            hs.add(nums[right]);
            if(right - left + 1 == k){
                res = Math.max(res, currWsum);
                currWsum -= nums[left];
                hs.remove(nums[left]);
                left++;
            }
            right++;
        }
    return res;
    }
}