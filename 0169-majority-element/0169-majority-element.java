class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i])==false){
                hm.put(nums[i],1);
            }
            else{
            int temp = hm.get(nums[i]);
            hm.put(nums[i],temp+1);
            }
        }
        int ans = 0;
        int max = 0;
          for(int i=0; i<nums.length; i++){
            if(hm.get(nums[i])>max){
               max = hm.get(nums[i]);
               ans = nums[i];
            }
          }
           return ans;
    }
}