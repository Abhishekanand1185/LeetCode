class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i=left; i<=right; i++){
           if(isSelfDivide(i)) ans.add(i);
        }
    return ans;
    }

     private boolean isSelfDivide(int num){
        int ogNum = num;

        while(num > 0){
            int digit = num % 10;
            num /= 10;

            if(digit == 0 || ogNum % digit != 0)    return false;
        }
        return true;
    }
}