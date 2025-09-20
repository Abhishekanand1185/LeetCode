class Solution {
    public boolean canEat(int[] piles, int mid, int h){
        int totalHours = 0;
        for(int p : piles){
            totalHours += p / mid;
            if(p % mid != 0){
                totalHours++;
            }
        }
    return totalHours <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for(int p : piles){
            high = Math.max(high, p);
        }

        while(low < high){
            int mid = low + (high-low)/2;
            if(canEat(piles,mid, h)){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
    return low;
    }
}