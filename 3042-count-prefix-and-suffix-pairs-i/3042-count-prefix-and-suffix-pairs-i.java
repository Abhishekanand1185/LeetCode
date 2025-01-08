class Solution {
    private boolean isPrefixSuffix(String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        if( n > m){
            return false;
        }
    return str2.substring(0, n).equals(str1) && str2.substring(m-n).equals(str1);
    }
    public int countPrefixSuffixPairs(String[] words) {
        int n = words.length;
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(isPrefixSuffix(words[i],words[j])) count++;
            }
        }
    return count;
    }
}