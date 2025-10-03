class Solution {
    public int change(int amount, int[] coins) {
        int dp[][] = new int[301][5001];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i], -1);
        }
        return helper(0, amount, coins, dp);
    }

    public int helper(int idx, int amount, int coins[], int dp[][]){
        if(amount  == 0){
            return 1;
        }
        if(idx == coins.length){
            return 0;
        }
        if(dp[idx][amount] != -1){
            return dp[idx][amount];
        }
        if(coins[idx] > amount){
            return dp[idx][amount] = helper(idx + 1, amount, coins, dp);
        }

        int take = helper(idx, amount-coins[idx], coins, dp);
        int skip = helper(idx+1, amount, coins, dp);

        return dp[idx][amount] = take + skip;
    }
}