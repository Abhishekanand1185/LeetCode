class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        boolean broken[] = new boolean[26];
        int count = 0;
        for(char c: brokenLetters.toCharArray()){
            broken[c-'a'] = true;
        }
        String words[] = text.split(" ");
        for(String word: words){
            boolean type = true;
            for(char c: word.toCharArray()){
                if(broken[c-'a']){
                    type = false;
                    break;
                }
            }
            if(type) count++;
        }
    return count;
    }
}