class Solution {
    public int tupleSameProduct(int[] nums) {
        int n = nums.length, count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int mul = nums[i]*nums[j];
                hm.put(mul, hm.getOrDefault(mul,0)+1);
            }
        }
        for(int key: hm.keySet()){
            int freq = hm.get(key);
            count += freq*(freq-1)/2;
        }
    return count * 8;
    }
}