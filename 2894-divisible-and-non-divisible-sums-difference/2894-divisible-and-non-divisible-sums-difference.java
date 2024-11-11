class Solution {
    public int differenceOfSums(int n, int m) {
        int divBym = 0;
        int notDivBym = 0;
        for(int i=1; i<=n; i++){
           if (i % m == 0){
            divBym += i;
           } else{
            notDivBym += i;
           }
        }
    return notDivBym - divBym;
    }
}