class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        int n = nums.length;
        while(i < n){
            if(nums[i] < 1 || nums[i] > n || i == nums[i] - 1){
                i++;
            }
            else{
                int idx = nums[i] - 1;
                if(nums[i] == nums[idx]){
                    i++;
                }
                else{
                    swap(nums, i , idx);
                }
            }
        }
        for(int j=0; j<n; j++){
            if(j != nums[j]-1){
                return j + 1;
            }
        }
    return n+1;
    }
    private void swap(int arr[], int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}