class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        while(low < high){
            int mid = low + (high-low)/2;
            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low++;
                high--;
            }
            if(nums[mid] <= nums[high]){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
    return nums[low];
    }
}