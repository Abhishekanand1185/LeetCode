class Solution {
    public static int calculate(int weights[], int m){
        int sum = 0;
        int days = 1;
        for(int wt : weights){
            if(sum + wt > m){
                days++;
                sum = 0;
            }
            sum += wt;
        }
    return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int minW = weights[0];
        int maxW = 0;
        for(int wt: weights){
            if(wt > minW){
                minW = wt;
            }
            maxW += wt;
        }
        int ans = 0;
        int low = minW;
        int high = maxW;
        while(low <= high){
            int mid = low+(high-low)/2;
            int reqDays = calculate(weights, mid);
            if(reqDays <= days){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
    return ans;
    }
}