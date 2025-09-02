class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        int ans = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(List<Integer> bl : wall){
            int len = 0;
            for(int i=0; i<bl.size()-1; i++){
                len += bl.get(i);
                hm.put(len, hm.getOrDefault(len, 0)+1);
                ans = Math.max(ans, hm.get(len));
            }
        }
    return wall.size() - ans;
    }
}