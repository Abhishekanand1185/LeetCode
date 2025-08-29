class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int left = 0;
        int chIdx[] = new int[128];
        Arrays.fill(chIdx,-1);
        for(int i=0; i<s.length(); i++){
            if(chIdx[s.charAt(i)] >= left){
                left = chIdx[s.charAt(i)]+1;
            }
        chIdx[s.charAt(i)] = i;
        maxLen = Math.max(maxLen, i-left+1);
        }

    return maxLen;
    }
}