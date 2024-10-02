class Solution {
    public String reverseVowels(String s) {
        char ch[] = s.toCharArray();
        int left = 0;
        int right = ch.length-1;
        String vowels = "aeiouAEIOU";

        while(left<right){
         if(isVowel(ch[left]) && isVowel(ch[right])){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
         }
         else if(!isVowel(ch[left])){
            left++;
         }
         else{
            right--;
         }
        }
        return new String(ch);
    }
       // Method to check that the index is a vowel or not

       public boolean isVowel(char v){
       if(v == 'a' || v == 'e' || v == 'i' || v == 'o'|| v == 'u' ||
          v == 'A' || v == 'E' || v == 'I'|| v == 'O' || v == 'U'){
                return true;
            }
        return false;
    }
}