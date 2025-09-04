class RandomizedSet {
    HashMap<Integer, Integer> hm;
    List<Integer> li;
    public RandomizedSet() {
        hm = new HashMap<>();
        li = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(hm.containsKey(val)) return false;
        hm.put(val, li.size());
        li.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!hm.containsKey(val)) return false;
        int idx = hm.get(val);
        hm.remove(val);
        if (idx == li.size()-1) {
            li.remove(li.size()-1);
            return true;
        }
        int idx2 = li.size()-1;
        int temp = li.get(idx2);
        swap(idx, idx2);
        li.remove(li.size()-1);
        hm.put(temp, idx);
        return true;
    }
    
    public int getRandom() {
        Random rand = new Random();
        return li.get(rand.nextInt(li.size()));
    }

    public void swap(int i, int j){
        int a = li.get(i);
        int b = li.get(j);
        li.set(i, b);
        li.set(j, a);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */