class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int gift : gifts){
            pq.add(gift);
        }
        for(int i=0; i<k && pq.peek() > 1; i++){
            int rem = pq.poll();
            pq.add((int) Math.sqrt(rem));
        }
        long sum = 0;
        for(int val : pq){
            sum+=val;
        }
    return sum;
    }
}