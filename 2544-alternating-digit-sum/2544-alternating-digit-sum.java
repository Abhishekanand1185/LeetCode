class Solution {
    public int alternateDigitSum(int n) {
        int count=0, sum=0, rem=0, i = 0;
        int temp = n;
        while(temp != 0){
            int r = temp%10;
            count++;
            temp /= 10;
        }
        if(count%2 == 0){
            while(n != 0){
                i++;
                if(i%2 == 0){
                    rem = n % 10;
                }
                else{
                    rem = (n%10) * (-1);
                }
            sum += rem;
            n /= 10;
            }
        }
        else{
             while(n != 0){
                i++;
                if(i%2 == 0){
                    rem = (n%10) * -1;
                }
                else{
                    rem = n%10;
                }
            sum += rem;
            n /= 10;
            }
        }
    return sum;
    }
}