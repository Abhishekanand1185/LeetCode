class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int[] countarr = new int[51];

        for (int c : capacity) {
            countarr[c]++;
        }

        int index = 0;
        for (int i = 0; i <= 50; i++) {
            while (countarr[i] > 0) {
                capacity[index++] = i;
                countarr[i]--;
            }
        }
        
        int totalApple = 0;
        for(int a : apple) {
            totalApple += a;
        }

        int count = 0;
        int i = capacity.length - 1;

        while (totalApple > 0 && i >= 0) {
            totalApple -= capacity[i];
            count++;
            i--;
        }

    return count;
    }
}