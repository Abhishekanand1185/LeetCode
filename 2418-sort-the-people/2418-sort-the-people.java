class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();
        int n = names.length;
        for(int i=0; i<n; i++){
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        int h = heights.length;
        String ans[] = new String[h];
        int idx = 0;
        for(int i = h-1; i>=0; i--){
            ans[idx] = map.get(heights[i]);
            idx++;
        }
    return ans;
    }
}