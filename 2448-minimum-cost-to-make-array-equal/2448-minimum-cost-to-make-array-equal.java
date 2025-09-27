class Solution {
    public long findCost(int mid, int nums[], int cost[]){
        long res = 0L;
        for(int i=0; i<nums.length; i++){
            long diff = Math.abs((long)nums[i] - mid);
            res +=  diff * cost[i];
        }
    return res;
    }
    public long minCost(int[] nums, int[] cost) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }
        long res = Long.MAX_VALUE;
        while(min <= max){
            int mid = min + (max-min)/2;
            long cost1 = findCost(mid, nums, cost);
            long cost2 = findCost(mid+1, nums, cost);
            res = Math.min(res, Math.min(cost1, cost2));
            if(cost2 > cost1){
                max = mid - 1;
            }
            else{
                min = mid + 1;
            }
        }
    return res;
    }
}