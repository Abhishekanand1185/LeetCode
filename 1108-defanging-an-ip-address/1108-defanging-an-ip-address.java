class Solution {
    public String defangIPaddr(String address) {
     StringBuilder st = new StringBuilder();
     for(int i = 0; i < address.length(); i++){
        if(address.charAt(i) != '.'){
            st.append(address.charAt(i));
        }

        else{
            st.append("[.]");
        }
     }   
     return new String(st);
    }
}