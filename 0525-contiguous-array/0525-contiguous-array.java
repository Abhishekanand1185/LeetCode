class Solution {
    public int findMaxLength(int[] nums) {
       int n = nums.length;
       HashMap<Integer, Integer> hm = new HashMap<>();
       hm.put(0,-1);
       int ans = 0;
       int count = 0;
       for(int e=0; e<n; e++){
            if(nums[e] == 1){
                count++;
            }else{
                count--;
            }
            if(hm.containsKey(count)){
                ans = Math.max(ans, e - hm.get(count));
            }else{
                hm.put(count,e);
            }
       }
        
    return ans;
    }
}