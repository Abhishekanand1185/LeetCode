class Solution {
    public int maxOperations(String s) {
        StringBuilder sb = new StringBuilder(s);
        int operations = 0;
        int n = s.length();
        int count1seen = 0;
        int i = 0;
        while(i < n){
            if(s.charAt(i) == '0'){
                operations += count1seen;
                while( i < n && s.charAt(i) == '0'){
                    i++;
                }
            }
            else{
                count1seen += 1;
                i++;
            }
        }
        return operations;
    }
}