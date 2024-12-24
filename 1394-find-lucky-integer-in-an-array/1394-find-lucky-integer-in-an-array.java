class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num : arr){
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }
        int count = -1;
        for(int i : hm.keySet()){
            if(i == hm.get(i)){
                if(i > count){
                    count = i; 
                }
            }
        }
    return count;
  }
}