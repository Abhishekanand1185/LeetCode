class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a,b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        int ans = 0;
        int n = envelopes.length;
        int dp[] = new int[n];
        for(int i=0; i<n; i++){
            int low = 0;
            int high = ans;
            while(low < high){
                int mid = low+(high-low)/2;
                if(dp[mid] < envelopes[i][1]){
                    low = mid + 1;
                }
                else{
                    high = mid;
                }
            }
            dp[low] = envelopes[i][1];
            if(low == ans){
                ans++;
            }
        }
    return ans;
    }
}