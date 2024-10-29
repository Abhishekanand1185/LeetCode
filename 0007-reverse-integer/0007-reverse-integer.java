class Solution {
    public int reverse(int x) {
        boolean isNegative = false;
        if(x < 0) {
            isNegative = true;
            x = -x;
        }
        long ans = 0;
        while(x > 0){
            int rem = x % 10;
            ans = ans * 10 + rem;
            x /= 10;
        }
        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE){
            return 0;
        }
        int res = (int)ans;
    return isNegative ? -res : res;    
    }
}