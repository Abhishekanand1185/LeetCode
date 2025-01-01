class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int onesCount = 0;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '1') onesCount++;
        }
        int maxScore = 0;
        int zerosCount = 0;

        for(int i=0; i<n-1; i++){
            if(s.charAt(i) == '0'){
                zerosCount++;
            } else{
                onesCount--;
            }
            int currScore = zerosCount + onesCount;
            if(currScore > maxScore){
                maxScore = currScore;
            }
        }
    return maxScore;
    }
}