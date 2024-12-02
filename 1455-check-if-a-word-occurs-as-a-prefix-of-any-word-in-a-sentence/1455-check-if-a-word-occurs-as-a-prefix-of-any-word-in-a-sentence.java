class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String words[] = sentence.split(" ");
        int len = searchWord.length();
        int n = words.length;
        for(int i=0; i<n; i++){
            if(words[i].length() >= len){
                if(words[i].substring(0, len).equals(searchWord)){
                    return i+1;
                }
            }
        }
    return -1;
    }

}