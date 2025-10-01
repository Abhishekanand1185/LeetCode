class Solution {
    public int triangularSum(int[] nums) {
        List<Integer> li = new ArrayList<>();
        for(int num : nums){
            li.add(num);
        }
        while(li.size() != 1){
            List<Integer> res = new ArrayList<>();
            for(int i = 0; i < li.size()-1 ; i++){
                int temp = li.get(i) + li.get(i + 1);
                res.add(temp % 10);
            }
            li.clear();
            li.addAll(res);
        }
    return li.get(0);
    }
}