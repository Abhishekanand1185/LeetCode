class Solution {
    public boolean wordPattern(String pattern, String s) {
        String words[] = s.split(" ");

        if(words.length != pattern.length()){
            return false;
        }

        HashMap<String, Character> wordToChar = new HashMap<>();
        HashMap<Character, String> charToWord = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            String word = words[i];
          if( !charToWord.containsKey(c) ){
            charToWord.put(c, word);
          }

          if( !wordToChar.containsKey(word) ){
            wordToChar.put(word, c);
          }
          if( !charToWord.get(c).equals(word) || ! !wordToChar.equals(c)){
             return false;
          }
        
        }
        return true;
    }
}