class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        int ans = 0;
        int currCount = 1, prevCount = 0;
        for(int i = 1; i < n ; i++){
            if(nums.get(i) > nums.get(i-1)){
                currCount++;
            }
            else{
                prevCount = currCount;
                currCount = 1;
            }

            if(currCount/2 > ans){
                ans = currCount/2;
            }
            int temp = Math.min(prevCount, currCount);
            if(temp > ans){
                ans = temp;
            }
        }
    return ans;
    }
}