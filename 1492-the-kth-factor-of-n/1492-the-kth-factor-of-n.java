class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> li = new ArrayList<>();
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                li.add(i);
                count++;
            }
        }
        if(k==0){
            return li.get(0);
        }
        if(k>count){
            return -1;
        }
        return li.get(k-1);
    }
}