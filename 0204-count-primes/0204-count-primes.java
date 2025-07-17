class Solution {
    public int countPrimes(int n) {
        if(n<2){
            return 0;
        }
        boolean p[] = new boolean[n+1];
        Arrays.fill(p, true);
        p[0] = p[1] = false;

        for(int i=2; i*i<=n; i++){
            if(p[i] == true){
                for(int j = i*i; j<=n; j+=i){
                    p[j] = false;
                }
            }
        }

        int PrimeCount = 0;
        for(int i=0; i<=n; i++){
            if(p[i] == true) PrimeCount++;
        }
    return PrimeCount;
    }
}