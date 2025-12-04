class Solution {
    public int countCollisions(String directions) {
        int left = 0, count = 0;
        int n = directions.length();
        int right = n-1;
        while(left < n && directions.charAt(left) == 'L'){
                left++;
        }

        while(right >= 0 && directions.charAt(right) == 'R'){
                right--;
        }

        while(left <= right){
            if(directions.charAt(left) == 'L' || directions.charAt(left) == 'R'){
                count++;
            }
            left++;
        }
    return count;
    }
}