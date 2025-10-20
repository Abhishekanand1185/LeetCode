class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String o : operations){
            if(Character.isLetter(o.charAt(0))){
                if(o.charAt(2) == '+') x += 1;
                else x -= 1;
            }
            else{
                if(o.charAt(0) == '+') x += 1;
                else x-= 1;
            }
        }
    return x;
    }
}