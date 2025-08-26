class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int ans[] = new int[nums.length-k+1];
        for(int i = 0; i < k; i++){
            while(!dq.isEmpty() && nums[i] > dq.getLast()){
                dq.removeLast();
            }
            dq.addLast(nums[i]);
        }
        ans[0] = dq.getFirst();
        
        for(int i = 1; i<nums.length-k+1; i++){
            while(!dq.isEmpty() && nums[i+k-1] > dq.getLast()){
                dq.removeLast();
            }
            dq.addLast(nums[i+k-1]);
            
            if(dq.getFirst() == nums[i-1]){
                dq.removeFirst();
            }
        ans[i] = dq.getFirst();
        }
    return ans;
    }
}