class Solution {
    public int longestSubarray(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num: nums){
            pq.add(num);
        }
        int top = pq.poll();
        // System.out.println(top);
        int c = 0;
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == top){
                c++;
                ans = Math.max(c, ans);
            }else{
                c=0;
            }      
        }
    return ans;
    }
}