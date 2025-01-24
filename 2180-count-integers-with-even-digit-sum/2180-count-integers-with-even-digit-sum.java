class Solution {
    public int countEven(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            int digSum = 0;
            int temp = i;

            while (temp != 0) {
                digSum += temp % 10;
                temp /= 10;
            }

            count += ((digSum % 2 == 0)? 1 : 0);
        }

        return count;
    }
}