class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] buckets = new int[102];
        for(int num : nums){            
            buckets[num]++;
        }
        for(int i=1; i<102; i++) {
            buckets[i] += buckets[i-1];
        }
        int res[] = new int[n];
        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                res[i] = 0;
            }
            else{
                res[i] = buckets[nums[i]-1];
            }
        }  
        return res;  
    }
}