class Solution {
    public boolean isFascinating(int n) {
        int a = 2*n;
        int b = 3*n;
        HashSet<Integer> hs = new HashSet<>();
        while(a != 0){
           int r = a % 10;
           if(hs.contains(r)==false){
                hs.add(r);
           }
           a/=10;
        }
        while(b != 0){
           int r = b % 10;
           if(hs.contains(r)==false){
                hs.add(r);
           }
           b/=10;
        }
        while(n != 0){
           int r = n % 10;
           if(hs.contains(r)==false){
                hs.add(r);
           }
           n/=10;
        }
        if(hs.contains(0) || hs.size() != 9){
            return false;
        }
    return true;
    }
}