class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int n = p.length();
        if(p.length() > s.length()) return ans;
        Map<Character, Integer> hm1 = new HashMap<>();
        for(int i=0; i<n; i++){
            char v = p.charAt(i);
            hm1.put(v, hm1.getOrDefault(v, 0)+1);
        }
        
        Map<Character, Integer> hm2 = new HashMap<>();
        for(int i=0; i<n; i++){
            char v = s.charAt(i);
            hm2.put(v, hm2.getOrDefault(v, 0)+1);
        }

        if(hm1.equals(hm2)){
            ans.add(0);
        }

        for(int i = n; i<s.length(); i++){
           char add = s.charAt(i);
           char rem = s.charAt(i-n);

           hm2.put(rem, hm2.get(rem) - 1);
           if(hm2.get(rem) == 0){
              hm2.remove(rem);
           }
           hm2.put(add, hm2.getOrDefault(add, 0)+1);
           if(hm1.equals(hm2)){
              ans.add(i-n+1);
           }
        }
    return ans;
    }
}