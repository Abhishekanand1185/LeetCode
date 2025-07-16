class Solution {
    private static final int MOD = 1337;
    private int pow(int a, int b){
        int res = 1;
        a = a % MOD;
        for(int i = 0; i<b; i++){   
            res = (res * a) % MOD;        
        }
    return res;
    }
    public int superPow(int a, int[] b) {
        int res = 1;
        for(int i = b.length - 1; i>=0; i--){
            res = (res* pow(a, b[i])) % MOD;
            a = pow(a,10);
        }
    return res;
    }
}