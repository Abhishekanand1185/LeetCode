class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length()/2;
        int leftCount = 0;
        int rightCount = 0;
        for(int i = 0; i<mid; i++){
            char c = Character.toLowerCase(s.charAt(i));
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                leftCount ++;
            }
        }
        for(int j = mid; j<s.length(); j++){
            char d = Character.toLowerCase(s.charAt(j));
            if(d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u'){
                rightCount ++;
            }
        }
        if(leftCount == rightCount){
            return true;
        }
    return false;
    }
}