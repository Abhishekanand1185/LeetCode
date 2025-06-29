class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(st.size() == 0 || st.peek() != s.charAt(i)){
                st.push(s.charAt(i));
            } else{
                st.pop();
            }
        }
        char ans[] = new char[st.size()];
        for(int i=st.size()-1; i>=0; i--){
            ans[i] = st.pop();
        }
    return String.valueOf(ans);
    }
}