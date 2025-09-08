class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int a=1; a<n; a++){
             int b = n-a;
             if(!containZero(a) && !containZero(b)){
                return new int[]{a,b};
             }
        }
    return new int[]{};
    }

    private boolean containZero(int x){
        while(x > 0){
            if(x % 10 == 0){
                return true;
            }
            x /= 10;
        }
    return false;
    }
}