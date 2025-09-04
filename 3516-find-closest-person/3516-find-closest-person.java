class Solution {
    public int findClosest(int x, int y, int z) {
        int ans = 0;
        int xz = Math.abs(x-z);
        int yz = Math.abs(y-z);

        if(xz == yz){
            return 0;
        }
        if(xz < yz){
            return 1;
        }
    return 2;
    }
}