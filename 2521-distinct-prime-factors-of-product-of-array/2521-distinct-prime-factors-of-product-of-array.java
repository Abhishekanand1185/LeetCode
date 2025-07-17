class Solution {
    public int distinctPrimeFactors(int[] nums) {
        int prod = 1;
        for(int i=0; i<nums.length; i++){
            prod = prod * nums[i];
        }
        HashSet<Integer> hs = new HashSet<>();
        int count = 0;
        for(int i=0; i<nums.length; i++){
            int n = nums[i];
            int c = 2;
            while(n>1){
                if(n%c == 0){
                    hs.add(c);
                    n /= c;
                } else{
                    c++;
                }
            }
        }    
    return hs.size();
    }
}