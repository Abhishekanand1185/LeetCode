class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int prefSum[] = new int[n];
        prefSum[0] = nums[0];
        for(int i=1; i<n; i++){
            prefSum[i]=prefSum[i-1] + nums[i];
        }
        int pivot = -1;
        if(0 == prefSum[n-1]-prefSum[0]){
            return 0;
        }

        for(int i=1; i<n; i++){
          int leftSum = prefSum[i-1];
          int rightSum = prefSum[n-1] - prefSum[i];
          if(leftSum == rightSum){
            return i;
          }
        }

        if(prefSum[n-2] == 0){
            return n-2;
        }
    return pivot;
    }
}