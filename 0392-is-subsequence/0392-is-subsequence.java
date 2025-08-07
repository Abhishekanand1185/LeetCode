class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = 0;
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            st.push(s.charAt(i));
        }
        for(int j=t.length()-1; j>=0; j--){
            if(!st.isEmpty() && (st.peek() == t.charAt(j))){
                st.pop();
            }
        }
    return st.isEmpty();
    }
}