class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = lowLimit; i <= highLimit; i++){
            int val = 0;
            int temp = i;
            while( temp != 0){
                int rem = temp % 10;
                val += rem;
                temp /= 10;
            }
            hm.put(val, hm.getOrDefault(val, 0)+1);
        }
        int count = Integer.MIN_VALUE;
        for(int val : hm.values()){
            if( val > count ){
            count = val;
            }
        }
    return count;
    }
}