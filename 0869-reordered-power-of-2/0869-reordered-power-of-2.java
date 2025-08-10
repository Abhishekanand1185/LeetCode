class Solution {
    public boolean reorderedPowerOf2(int n) {
        String st = String.valueOf(n);
        HashMap<Character, Integer> hm1 = new HashMap<>();
        for(char c: st.toCharArray()){
            hm1.put(c, hm1.getOrDefault(c, 0)+1);
        }
        for(int i=0; i<32; i++){
            int temp = 1 << i;
            String ns = String.valueOf(temp);
            HashMap<Character, Integer> hm2 = new HashMap<>();
            for(char c: ns.toCharArray()){
                hm2.put(c, hm2.getOrDefault(c, 0)+1);
            }
            if(hm1.equals(hm2)){
                return true;
            }
        }
    return false;
    }
}