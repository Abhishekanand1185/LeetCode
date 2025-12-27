class Solution {
    List<List<Integer>> resList = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        solve(new ArrayList<>(), nums, 0);
    return resList;
    }
    private void solve(List<Integer> tempList, int nums[], int start){
        resList.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i-1]) continue;
            tempList.add(nums[i]);
            solve(tempList, nums, i+1);
            tempList.remove(tempList.size()-1);
        }
    }
}