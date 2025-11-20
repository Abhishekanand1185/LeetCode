class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int a = nums[i];
            int b = target - a;
            if(hm.containsKey(b) == true){
                return new int[]{i, hm.get(b)};
            }
            else{
                hm.put(a, i);
            }
        }
    return new int[]{};
    }
}