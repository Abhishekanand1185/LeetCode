class Solution {
    public boolean isHappy(int n) {
        while(n>=10){
             n = NextSum(n);
        }
         if(n==1 || n==7){
                return true;
            }
        return false;

    }

    public static int NextSum(int n){
        int res = 0;
        while(n>0){
            int digit = n%10;
            res+=digit*digit;
            n/=10;
        }
        return res;
    }
}