class Solution {
    private int n;
    private int[][] dp = new int[100001][3];
    public int maxTwoEvents(int[][] events) {
        n = events.length;
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        for(int row[] : dp){
            Arrays.fill(row, -1);
        }
        return solve(events, 0, 0);
    }

    private int solve(int events[][], int idx, int count){
        if(count == 2 || idx >= n){
            return 0;
        }
        
        if(dp[idx][count] != -1){
            return dp[idx][count];
        }

        int nextvalidIndex = binarySearch(events, events[idx][1]);
        int take = events[idx][2] + solve(events, nextvalidIndex, count+1);
        int notTake = solve(events, idx+1, count);
        dp[idx][count] = Math.max(take, notTake);       
        return dp[idx][count];
    }
    
    private int binarySearch(int events[][], int endTime){
        int low = 0;
        int high = n-1;
        int res = n;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(events[mid][0] > endTime){
                res = mid;
                high = mid - 1;
            } else{
                low = mid + 1;
            }
        }
    return res;
    }
}