class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int currsum = 0;
        int ans = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,1);
        for(int num: nums){
            currsum += num;
            if(hm.containsKey(currsum-k)){
                ans += hm.get(currsum-k);
            }
            hm.put(currsum, hm.getOrDefault(currsum, 0)+1);
        }
    return ans;
    }
}