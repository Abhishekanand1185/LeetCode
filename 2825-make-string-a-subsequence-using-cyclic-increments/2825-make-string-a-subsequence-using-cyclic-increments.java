class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int str1Index = 0;
        int str2Index = 0;
        int n = str1.length();
        int m = str2.length();
        if(n < m){
            return false;
        }
        while(str1Index < n && str2Index < m){
            char s1Char = str1.charAt(str1Index);
            char s2Char = str2.charAt(str2Index);
            if(s1Char == s2Char || 
            (s1Char == 'z' && s2Char == 'a') || 
            (s1Char + 1 == s2Char)){
                str1Index ++;
                str2Index ++;
            }
            else{
                str1Index ++;
            }
        }
    return str2Index == m;
    }
}