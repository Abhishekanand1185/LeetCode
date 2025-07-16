class Solution {
    private static int gcd(int a, int b){
        if(a==0){
            return b;
        }
       int temp = gcd(b%a, a);
    return temp;
    }
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
            if(nums[i] > max){
                max = nums[i];
            }
        }
    return gcd(min, max);
    }
}