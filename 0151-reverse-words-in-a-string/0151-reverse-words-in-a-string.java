class Solution {
    public String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+", " ");
        String ch[] = s.split(" ");
        String ans = "";
        for(int i = ch.length-1; i>=0; i--){
            if(i != 0){
                ans += ch[i] + " ";
            }
            else{
                ans += ch[i];
            }
        }
    return ans;
    }
}