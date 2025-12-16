class Solution {
    public long getDescentPeriods(int[] prices) {
        long res = 1;
        long count = 1;
        int n = prices.length;
        for(int i = 1; i<n; i++){
           if(prices[i-1] - prices[i] == 1){
                count += 1;
            }
            else{
                count = 1;
            }
        res += count;
        }
    return res;
    }
}