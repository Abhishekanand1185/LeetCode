class Solution {
    public int maximum69Number (int num) {
        String n = num+"";
        char ch[]= n.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(ch[i] == '6'){
                ch[i] = '9';
                break;
            }
        }
    return Integer.valueOf(new String(ch));
    }
}