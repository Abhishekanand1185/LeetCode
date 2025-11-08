class Solution {
    public long flowerGame(int n, int m) {
        long case1 = (long)((n + 1) / 2) * (m / 2);
        long case2 = (long)(n / 2) * ((m + 1) / 2);
    return case1 + case2;
    }
}