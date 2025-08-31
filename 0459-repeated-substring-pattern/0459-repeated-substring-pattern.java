class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int lpsArray[] = lps(s);
        int n = s.length();
    return lpsArray[n - 1] > 0 && n % (n - lpsArray[n - 1]) == 0;
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
            lps[i] = len+1;
            }
        }
    return lps;
    }
}