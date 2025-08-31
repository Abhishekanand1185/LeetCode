class Solution {
    public String longestPrefix(String s) {
        int n = s.length();
        int lps[] = new int[n];
        for(int i=1; i<n; i++){
            int len = lps[i-1];
            if(s.charAt(i) == s.charAt(len)){
                lps[i] = len+1;
            }
            else{
                while(s.charAt(i) != s.charAt(len)){
                    if(len == 0){
                        len = -1;
                        break;
                    }
                    len = lps[len-1];
                }
            lps[i] = len + 1;
            }
        }
    int end = lps[n-1];
    return s.substring(0,end);
    }
}