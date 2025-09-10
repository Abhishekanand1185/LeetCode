class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int diff[] = new int[n];
        char ans[] = new char[n];
        for(int i=0; i<shifts.length; i++){
            int l = shifts[i][0];
            int r = shifts[i][1];
            int dir = shifts[i][2];
            int x;
            if(dir == 0){
                x = -1;
            } else{
                x = 1;
            }

            diff[l] += x;
            if(r+1 < n){
                diff[r+1] -= x;
            }
        }

        for(int i=1; i<n; i++){
            diff[i] = diff[i-1] + diff[i];
        }

        for(int i=0; i<n; i++){
            int shift = diff[i] % 26;
            if(shift < 0){
                shift += 26;
            }

            ans[i] = (char)(((s.charAt(i) - 'a') + shift) % 26 + 'a');
        }
    return new String(ans);
    }
}