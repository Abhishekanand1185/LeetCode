class Solution {
    public int countOdds(int low, int high) {
        int dif = high - low;
        if(dif % 2 == 0 && high % 2 == 1){
            return dif/2+1;
        }
        else if(dif % 2 == 1){
            return dif/2+1;
        }
        else{
            return dif/2;
        }
    }
}