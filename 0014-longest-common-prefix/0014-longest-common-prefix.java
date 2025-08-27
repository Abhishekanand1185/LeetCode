class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String pref = strs[0];
        int prefLen = pref.length();
        for(int i=1; i<strs.length; i++){
            String curr = strs[i];
            while(pref.length() > curr.length() || !pref.equals(curr.substring(0, prefLen))){
                prefLen--;
                if(prefLen == 0){
                    return "";
                }
            pref = pref.substring(0, prefLen);
            }
        }
    return pref;
    }
}