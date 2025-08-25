class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        TreeSet<Integer> heaterSet = new TreeSet<>();
        for (int heater : heaters) {
            heaterSet.add(heater);
        }

        int res = 0;
        for (int house : houses) {
            Integer floor = heaterSet.floor(house);
            Integer ceiling = heaterSet.ceiling(house);

            int leftDistance = floor == null ? Integer.MAX_VALUE : house - floor;
            int rightDistance = ceiling == null ? Integer.MAX_VALUE : ceiling - house;

            int minDistance = Math.min(leftDistance, rightDistance);
            res = Math.max(res, minDistance);
        }

    return res;
    }
}