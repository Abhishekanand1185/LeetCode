class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
       // return numBottles + (numBottles - 1) / (numExchange - 1);
        int tb = numBottles;
        int emb = numBottles;
        while(emb >= numExchange ){
          int nb = emb / numExchange ;
          tb += nb; 
          emb = nb + (emb % numExchange);
        }
    return tb;
    }
}