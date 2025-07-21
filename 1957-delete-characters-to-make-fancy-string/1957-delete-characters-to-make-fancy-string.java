class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder(s);
        int count = 1;
        for(int i=1; i<sb.length(); i++){
            if(sb.charAt(i) == sb.charAt(i-1)){
                count++;
            } else{
                count = 1;
            }
            if(count >= 3){
                sb.deleteCharAt(i);
                count--;
                i--;
            }
        }
    return sb.toString();
    }
}