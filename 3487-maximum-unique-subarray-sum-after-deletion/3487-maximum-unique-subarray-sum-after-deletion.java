class Solution {
    public int maxSum(int[] nums) {
       HashSet<Integer> hs = new HashSet<>();
       for(int num: nums){
        hs.add(num);
       } 
       int sum = 0;
       int count = 0;
       for(int n: hs){
        if(n>0){
            sum+=n;
        }else{
            count+=1;
        }
       }
       int max = Integer.MIN_VALUE;
       for(int n: hs){
        if(n>max){
            max= n;
        }
       }
       if(sum == 0){
        return max;
       }
    return sum;
    }
}