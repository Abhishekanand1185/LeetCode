class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;
        int vc = 0;
        int cs = 0;
        for(int i=0; i<word.length(); i++){
            char w = word.charAt(i);
            if(!Character.isLetterOrDigit(w)) return false;
            else if(Character.isLetter(w)){
                char l = Character.toLowerCase(w);
                if(l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u'){
                    vc++;
                } else{ 
                    cs++;
                }
            } 
        }
    return vc > 0 && cs > 0;
    }
}