class Solution {
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        HashMap<Integer, Integer> hm2 = new HashMap<>();
        HashMap<Integer, Integer> hm3 = new HashMap<>();
        HashMap<Integer, Integer> hm4 = new HashMap<>();
        HashMap<Integer, Integer> hm5 = new HashMap<>();
        int dir[][] = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1,0}, {1,-1}, {0, -1}, {-1, -1}, {0,0}};
        for(int i=0; i<lamps.length; i++){
            int x = lamps[i][0];
            int y = lamps[i][1];
            hm1.put(x, hm1.getOrDefault(x, 0)+1);
            hm2.put(y, hm2.getOrDefault(y, 0)+1);
            hm3.put(x-y, hm3.getOrDefault(x-y, 0)+1);
            hm4.put(x+y, hm4.getOrDefault(x+y, 0)+1);
            hm5.put(x*n+y, hm5.getOrDefault(x*n+y, 0)+1);
        }
        
        int ans[] = new int[queries.length];
        for(int i=0; i<queries.length; i++){
            int x = queries[i][0];
            int y = queries[i][1];
            if(hm1.getOrDefault(x, 0) > 0 || hm2.getOrDefault(y, 0) > 0 || hm3.getOrDefault(x-y, 0) > 0 || hm4.getOrDefault(x+y, 0) > 0 ){
                ans[i] = 1;
            }

            for(int d=0; d<9; d++){
                int x1 = x + dir[d][0];
                int y1 = y + dir[d][1];
                if(x1>=0 && x1<n && y1>=0 && y1<n && hm5.containsKey(x1*n+y1)){
                    int times = hm5.get(x1*n+y1);
                    hm1.put(x1, hm1.getOrDefault(x1, 0) - times);
                    hm2.put(y1, hm2.getOrDefault(y1, 0) - times);
                    hm3.put(x1-y1, hm3.getOrDefault(x1-y1, 0) - times);
                    hm4.put(x1+y1, hm4.getOrDefault(x1+y1, 0) - times);
                    hm5.remove(x1*n+y1);
                }
            }
        }
    return ans;
    }
}