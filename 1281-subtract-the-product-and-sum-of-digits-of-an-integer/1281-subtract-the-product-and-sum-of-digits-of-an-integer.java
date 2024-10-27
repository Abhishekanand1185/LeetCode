class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while(n>0){
            int r = n%10;
            sum+=r;
            product*=r;
            n/=10;
        }
        return product-sum;
    }
}