class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {

        Arrays.sort(happiness);  

        int left = 0;
        int right = happiness.length-1;
        while(left < right){
            int temp = happiness[left];
            happiness[left] = happiness[right];
            happiness[right] = temp;
            left++;
            right--;
        }
        int count = 0;
        long res = 0;
        for(int i = 0; i<k; i++){
            res += Math.max(0, happiness[i]-count);
            count++;
        }
    return res;
    }
}