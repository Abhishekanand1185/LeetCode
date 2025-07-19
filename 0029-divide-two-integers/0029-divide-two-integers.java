class Solution {
    public int divide(int dividend, int divisor) {
        long a = dividend;
        long b = divisor;
        int neg = 1;
        if(a < 0) neg *= -1;
        if(b < 0) neg *= -1;

        a = Math.abs(a);
        b = Math.abs(b);

        long temp = 0;
        long q = 0;
        for(int i=31; i>=0; i--){
            if((temp +(b<<i)) <= a){
                temp += (b<<i);
                q += (long)1<<i;
            }
        }
        if(neg == -1){
            q = -q;
        }
        if(q>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(q<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
    return (int)q;
    }
}