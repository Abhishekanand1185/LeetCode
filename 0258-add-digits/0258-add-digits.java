class Solution {
    public int addDigits(int num) {
        while(num >= 10){
            int sum = addDigitsHelper(num);
            num = sum;
        }
         return num;
    }
    public int addDigitsHelper(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}