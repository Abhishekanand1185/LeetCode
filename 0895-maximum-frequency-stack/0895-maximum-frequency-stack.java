class FreqStack {
        HashMap<Integer, Stack<Integer>> st;
        HashMap<Integer, Integer> freqMap;
        int maxFreq;
    public FreqStack() {
        st = new HashMap<>();
        freqMap = new HashMap<>();
        maxFreq = 0;
    }
    
    public void push(int val) {
        freqMap.put(val,freqMap.getOrDefault(val,0)+1);
        int freq = freqMap.get(val);
        if(st.containsKey(freq) == false){
            st.put(freq, new Stack<>());
        }
        st.get(freq).add(val);
        maxFreq = Math.max(maxFreq, freq);
    }
    
    public int pop() {
        int rem = st.get(maxFreq).pop();
        int freq = freqMap.get(rem);
        freq--;
        freqMap.put(rem, freq);
        if(st.get(maxFreq).isEmpty()){
            st.remove(maxFreq);
            maxFreq--;
        }
    return rem;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */