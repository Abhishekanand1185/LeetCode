class Solution {
    static final int M = (int)1e9 + 7;
    public int countPermutations(int[] complexity) {
        int n = complexity.length;
        long res = 1;
        for(int i = 1; i < n; i++){
            if(complexity[i] <= complexity[0]){
                return 0;
            }
            res = (res * i) % M;
        }
    return (int)res;
    }
}