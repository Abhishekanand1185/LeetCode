class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num : nums){
            int temp = ((num % value) + value) % value;
            hm.put(temp, hm.getOrDefault(temp, 0)+1);
        }
        int mex = 0;
        while(hm.containsKey(mex % value)){
            hm.put(mex % value, hm.get(mex % value) - 1);
            if(hm.get(mex % value) == 0){
                hm.remove(mex % value);
            }
            mex++;
        }
    return mex;
    }
}