class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int MOD = (int) 1e9 + 7;
        int q = queries.length;
        int ans[] = new int[q];
        List<Integer> power = new ArrayList<>();
        for(int i=0; i<31; i++){
            if((n >> i & 1) == 1){
                power.add(1<<i);
            }
        }
        for(int i=0; i<q; i++){
            long prod = 1;
            int left = queries[i][0];
            int right = queries[i][1];
            for(int j=left; j<=right; j++){
                prod = (prod * power.get(j)) % MOD;
            }
            ans[i] = (int) prod;
        }
    return ans;
    }
}