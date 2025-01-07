class Solution {
    public List<String> stringMatching(String[] words) {
        HashSet<String> hs = new HashSet<>();
        int n = words.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i != j){
                    String x = words[i];
                    String y = words[j];
                    if(x.contains(y)) hs.add(y);
                }
            }
        }
        List<String> ans = new ArrayList<>();
        for(String i: hs) ans.add(i);
    return ans;
    }
}