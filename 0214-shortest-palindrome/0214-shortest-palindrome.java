class Solution {
    public String shortestPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        String temp = s + "#" + rev;
        int lpsArr[] = lps(temp);
        String suffix = s.substring(lpsArr[lpsArr.length-1]);
        StringBuilder sb = new StringBuilder(suffix);
        sb.reverse();
        sb.append(s);
    return sb.toString();
    }
    public static int[] lps(String s){
        int n = s.length();
        int lps[] = new int[n];
        lps[0] = 0;
        for(int i=1; i<n; i++){
            int len = lps[i-1];
            if(s.charAt(i) == s.charAt(len)){
                lps[i] = len + 1;
            }
            else{
                while(s.charAt(i) != s.charAt(len)){
                    if(len == 0){
                        len = -1;
                        break;
                    }
                len = lps[len-1];
                }
            }
        lps[i] = len+1;
        }
    return lps;
    }
}