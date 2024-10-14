class Solution {
    public long maxKelements(int[] nums, int k) {
       PriorityQueue <Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
       for(int num : nums){
        maxheap.add(num);
       }

       long score = 0;
       for(int i=0; i<k; i++){
        int maxele = maxheap.poll();
        score += maxele;
        int newele = (int)Math.ceil(maxele / 3.0);
        maxheap.offer(newele);
       }
    return score;
    }
}