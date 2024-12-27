class Solution {
    public int secondHighest(String s) {
        int max = -1;
        int sMax = -2;
        int n = s.length();

        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                int ch = c - '0';
                if(ch > sMax && ch > max){
                    sMax = max;
                    max = ch;
                }
                else if(ch > sMax && ch < max){
                    sMax = max;
                }
            }
        }
       return sMax == -2 ? -1 : sMax;
    }
}