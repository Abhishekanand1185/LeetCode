class Solution {
    public String largestGoodInteger(String num) {
        String ans = "";
        for(int i=0; i<num.length()-2; i++){
            char a = num.charAt(i);
            if(a == num.charAt(i+1) && a == num.charAt(i+2)){
                String good = num.substring(i, i+3);
                if(ans.equals("") || good.compareTo(ans) > 0){
                    ans = good;
                }
            }
        }
    return ans;
    }
}