class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> vc = new HashMap<>();
        HashMap<Character, Integer> cc = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vc.put(ch, vc.getOrDefault(ch, 0) + 1);
            }
            else{
                cc.put(ch, cc.getOrDefault(ch, 0) + 1);
            }
        }
        int maxVc = 0;
        int maxCc = 0;
        for(int v : vc.values()){
            maxVc = Math.max(maxVc, v);
        }
        for(int v : cc.values()){
            maxCc = Math.max(maxCc, v);
        }
    return maxVc + maxCc;
    }
}