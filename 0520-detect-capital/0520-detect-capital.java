class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase())){
            return true;
        }
        if(word.equals(word.toLowerCase())){
            return true;
        }

        int charAtFirstIndex = (int)(word.charAt(0));

        if(charAtFirstIndex >= 65 && charAtFirstIndex <=91){
            String subString = word.substring(1, word.length());

            if(subString.equals(subString.toLowerCase())){
                return true;
            }
        }
    return false;
    }
}