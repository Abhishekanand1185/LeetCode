class Solution {
    public boolean isValid(String s) {
     Stack<Character> st = new Stack<>();
     for(int i=0; i<s.length(); i++){
        if(st.isEmpty() || s.charAt(i) == '(' || s.charAt(i) == '[' | s.charAt(i) == '{'){    
            st.push(s.charAt(i));
        }
        else if(s.charAt(i) == ')'){
            if(st.peek()=='('){
                st.pop();
            }
            else{
             return false;
            }
        }
        else if(s.charAt(i) == ']'){
            if(st.peek()=='['){
                st.pop();
            }
            else{
            return false;
            }
        }
        else if(s.charAt(i) == '}'){
            if(st.peek()=='{'){
                st.pop();
            }
            else{
            return false;
            }
        }
     }
      if(st.isEmpty()){
         return true;
      }
      return false;
    }
}