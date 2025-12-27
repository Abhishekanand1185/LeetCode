class Solution {
    List<List<Integer>> resList = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        solve(nums, new ArrayList<>(), new boolean[nums.length]);
    return resList;
    }
    private void solve(int[] nums, List<Integer> tempList, boolean[] used){
        if (tempList.size() == nums.length){
            resList.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = 0; i < nums.length; i++){
            if (used[i]) continue;

            if (i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue;

            used[i] = true;
            tempList.add(nums[i]);

            solve(nums, tempList, used);

            used[i] = false;
            tempList.remove(tempList.size() - 1);
        }
    }
}