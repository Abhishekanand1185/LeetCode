class Solution {
    public int minDeletionSize(String[] strs) {
        int res = 0;
        for (int j = 0; j < strs[0].length(); j++){
            if(isUnsorted(strs, j)){
                res += 1;
            }
        }
        return res;
    }

    private boolean isUnsorted(String[] strs, int j) {
        for (int i = 1; i < strs.length; i++){
            if (strs[i].charAt(j) < strs[i - 1].charAt(j)){
                return true;
            }
        }
        return false;
    }
}