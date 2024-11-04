class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        int n = word.length(), count = 1;
        char ch = word.charAt(0);
        for(int i = 1; i < n; i++){
            if(ch == word.charAt(i) && count < 9){
                count++;
            }
            else{
                sb.append(count).append(ch);
                ch = word.charAt(i);
                count = 1;
            }
        }
    sb.append(count).append(ch);
    return sb.toString();
    }
}