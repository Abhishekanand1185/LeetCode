class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> ans = new HashSet<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int v: nums1){
            hs.add(v);
        }
        for(int v: nums2){
            if(hs.contains(v) && !ans.contains(v)) ans.add(v);
        }
        int res[] = new int[ans.size()];
        int idx = 0;
        for(int v: ans){
            res[idx] = v;
            idx++;
        }
    return res;
    }
}