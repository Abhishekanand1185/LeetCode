class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int v: deck){
            hm.put(v, hm.getOrDefault(v, 0)+1);
        }
        int Gcd = 0;
        for(int v: hm.keySet()){
            Gcd = gcd(Gcd, hm.get(v));
        }
    return Gcd == 1 ? false: true;
    }
    private static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        int temp = gcd(b%a, a);
    return temp;
    }
}