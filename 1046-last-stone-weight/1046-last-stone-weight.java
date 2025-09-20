class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int s : stones){
            pq.add(s);
        }
        while(pq.size() > 1){
            int fi = pq.remove();
            int sec = pq.remove();
            int diff = fi - sec;
            if(diff>0){
                pq.add(diff);
            }
        }
    return !pq.isEmpty() ? pq.peek() : 0;
    }
}