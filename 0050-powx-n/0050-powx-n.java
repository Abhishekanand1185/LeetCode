class Solution {
    public double myPow(double x, int n) {
       if (n<0) {
        	int n1 = Math.abs(n);
        	double ans = pow(x, n1);
        	return 1/ans;
        } 
        double ans2 = pow(x, n);
            return ans2;
    }

    public double pow(double x ,  int n){
        if(n==0) {
    		return 1;
    	}
    	double res = pow(x,n/2);
    	if(n%2==0) {
    		return res*res;
    	}
    	return res*res*x;
    }
}