class Solution {
    public int countPrimeSetBits(int left, int right) {
        int primeSetBits = 0;
        for(int j=left ; j<=right; j++){
            int num = j;
            int setbits = 0;
            for(int i=0; i<32; i++){
                if(((num>>i) & 1) == 1){
                    setbits++;
                }
            }
            if(isPrime(setbits)){
                primeSetBits++;
            }
        }
    return primeSetBits;
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i*i<=n; i++){
            if(n%i*i == 0){
                return false;
            }
        }
    return true;
    }
}