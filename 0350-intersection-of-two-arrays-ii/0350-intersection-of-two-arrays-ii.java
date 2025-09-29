class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> ans = new HashMap<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<Integer> li = new ArrayList<>();
        for(int v: nums1){
            hm.put(v, hm.getOrDefault(v, 0)+1);
        }
        for(int v: nums2){
            if(hm.containsKey(v)){
                int freq = hm.get(v);
                int fr = ans.getOrDefault(v, 0);
                ans.put(v, fr + 1);
                hm.put(v, freq-1);
                if(hm.get(v) == 0){
                    hm.remove(v);
                }
            }
        }
        for(int v: ans.keySet()){
            int c = ans.get(v);
            for(int i=0; i<c; i++){
                li.add(v);
            }
        }
    return li.stream()
             .mapToInt(Integer::intValue)
             .toArray();
    }
}