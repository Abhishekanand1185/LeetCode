class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        int count = 0;
        for(int num : nums){
            hs.add(num);
            count++;
        }
        for(int i=1; i<=count; i++){
            if(hs.contains(i) == false){
               ans.add(i);
            }
        }
    return ans;
    }
}