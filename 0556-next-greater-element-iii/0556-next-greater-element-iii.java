class Solution {
    public int nextGreaterElement(int n) {
        char num[] = String.valueOf(n).toCharArray();
        int i = num.length-2;
        while(i>=0 && num[i] >= num[i+1]){
            i--;
        }
        if(i<0){
            return -1;
        }
        int j = num.length-1;
        while(num[j] <= num[i]){
            j--;
        }

        char temp = num[i];
        num[i] = num[j];
        num[j] = temp;

        reverse(num, i+1, num.length-1);
            
        long ans = Long.parseLong(new String(num));
        if(ans > Integer.MAX_VALUE){
            return -1;
        }
    return ans == n ? -1 : (int) ans;
    }

    private void reverse(char[] num, int left, int right) {
        while (left < right) {
            char temp = num[left];
            num[left] = num[right];
            num[right] = temp;
            left++;
            right--;
        }
    }
}