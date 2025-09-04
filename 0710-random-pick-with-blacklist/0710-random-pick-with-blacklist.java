class Solution {
    HashMap<Integer, Integer> hm = new HashMap<>();
    int valid;
    public Solution(int n, int[] blacklist) {
        int m = blacklist.length;
        for(int i=0; i<m; i++){
            hm.put(blacklist[i], -1);
        }

        valid = n - blacklist.length;
        for(int i = 0; i<m; i++){
            if(blacklist[i] < valid){
                while(hm.containsKey(n-1) == true){
                    n--;
                }
            hm.put(blacklist[i], n-1);
            n--;
            }
        }
    }
    
    public int pick() {
        Random r = new Random();
        int p = r.nextInt(valid);
        if(hm.containsKey(p)){
            return hm.get(p);
        }
    return p;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(n, blacklist);
 * int param_1 = obj.pick();
 */