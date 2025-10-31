class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int arr[] = new int[2];
        int idx = 0;
        for(int num : nums){
            if(hs.contains(num)){
                arr[idx] = num;
                idx++;
            }
            hs.add(num);
        }
    return arr;
    }
}