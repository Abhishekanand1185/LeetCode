class Solution {
    List<List<Integer>> resList = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        solve(nums, new ArrayList<>());
    return resList;
    }
    private void solve(int nums[], List<Integer> tempList){
        if(tempList.size() == nums.length){
            resList.add(new ArrayList<>(tempList));
        }
        for(int i = 0; i < nums.length; i++){
            if(tempList.contains(nums[i])) continue;
            tempList.add(nums[i]);
            solve(nums, tempList);
            tempList.remove(tempList.size() - 1);
        }
    }
}