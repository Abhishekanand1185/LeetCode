class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }
        int ans = 0;
        for(int i=0; i<t.length(); i++){
            char c = t.charAt(i);
            if(hm.containsKey(c)){
                hm.put(c, hm.get(c)-1);
                if(hm.get(c) == 0){
                    hm.remove(c);
                }
            }
            else{
                ans++;
            }
        }
    return ans;
    }
}