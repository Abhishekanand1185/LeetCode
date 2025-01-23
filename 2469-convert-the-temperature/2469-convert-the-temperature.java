class Solution {
    public double[] convertTemperature(double celsius) {
        double ans[] = new double[2];
        double kelv = celsius + 273.15;
        double farh = celsius*1.80+32.00;
        ans[0] = kelv;
        ans[1] = farh;
        return ans;
    }
}