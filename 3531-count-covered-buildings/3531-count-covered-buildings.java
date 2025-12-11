class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        int[] above = new int[n+1];
        int[] below = new int[n+1];
        int[] left = new int[n+1];
        int[] right = new int[n+1];

        Arrays.fill(above,Integer.MAX_VALUE);
        Arrays.fill(left,Integer.MAX_VALUE);

        for(int i = 0; i < buildings.length ; i++) {
            int x = buildings[i][0];
            int y = buildings[i][1];

            above[x] = Math.min(above[x],y);
            below[x] = Math.max(below[x],y);
            left[y] = Math.min(left[y],x);
            right[y] = Math.max(right[y],x);
        }

        int res = 0;

        for(int i = 0 ; i < buildings.length ; i++) {
            int x = buildings[i][0];
            int y = buildings[i][1];
            if(above[x] < y && below[x] > y && left[y] < x && right[y] > x) {
                res++;
            }
        }

        return res;
    }
}