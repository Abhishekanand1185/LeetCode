class Solution {
    public boolean isSubstringPresent(String s) {
        int n = s.length();
        for(int i=0; i<n-1; i++){
            for(int j=n-1; j>0; j--){
                if(s.charAt(i) == s.charAt(j) && s.charAt(i+1) == s.charAt(j-1)){
                    return true;
                }
            }
        }
    return false;
    }
}