class Solution {
    public int findMaxLength(int[] nums) {
       int n = nums.length;
       int pcz[] = new int[n];
       int pco[] = new int[n];
       int zero = 0;
       int one = 0;
       for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                one++;
            }
            else if(nums[i] == 0){
                zero++;
            }
           pcz[i] = zero;
           pco[i] = one;
       }
       HashMap<Integer, Integer> hm = new HashMap<>();
       hm.put(0,-1);
       int ans = 0;
       for(int e=0; e<n; e++){
            int diff = pco[e] - pcz[e];
            if(hm.containsKey(diff)){
                 ans = Math.max(ans, e - hm.get(diff));
            }
            hm.put(diff,e);
       }
        
    return ans;
    }
}