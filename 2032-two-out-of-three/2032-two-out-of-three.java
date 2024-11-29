class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        HashSet<Integer> hs3 = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();
        for(int n1 : nums1){
             hs1.add(n1);
        }
        for(int n2 : nums2){
            if(hs1.contains(n2)){
                ans.add(n2);
            }
        hs2.add(n2);
        }
        for(int n3 : nums3){
            if(hs1.contains(n3) || hs2.contains(n3)){
                ans.add(n3);
            }
        hs3.add(n3);
        }
    return new ArrayList<>(ans);
    }
}