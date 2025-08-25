class Solution {
    public boolean hasAlternatingBits(int n) {
        int lsb = n & 1;
        n = n >> 1;
        while(n > 0){
            if((n & 1) == lsb){
                return false;
            }
            lsb = n & 1;
            n = n >> 1;
        }
    return true;
    }
}