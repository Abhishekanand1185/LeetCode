class Solution {
    public double[] convertTemperature(double celsius) {
        double kelv = celsius + 273.15;
        double farh = celsius*1.80+32.00;
        double ans[] = {kelv, farh};
        return ans;
    }
}