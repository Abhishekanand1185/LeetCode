class Solution {
    public String convertToBase7(int num) {
        if(num == 0){
            return "0";
        }

        int checkNeg = 0;

        StringBuilder sb = new StringBuilder();
        if(num < 0){
          num = -num;
          checkNeg = 1;
        }
        while(num > 0){
            sb.append(num%7);
            num /= 7;
        }
        String ans = sb.reverse().toString();
        if(checkNeg == 1){
            return "-" + ans;
        }
        return ans;
    }
}