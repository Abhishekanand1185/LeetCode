class MedianFinder {
    PriorityQueue<Integer> minheap = new PriorityQueue<>();
    PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(minheap.size()==maxheap.size()){
            minheap.add(num);
            maxheap.add(minheap.remove());
        }
        else{
            maxheap.add(num);
            minheap.add(maxheap.remove());
        }
    }
    
    public double findMedian() {
        if(minheap.size()==maxheap.size()){
            return (minheap.peek() + maxheap.peek() )/2.0;
    }
        return maxheap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */