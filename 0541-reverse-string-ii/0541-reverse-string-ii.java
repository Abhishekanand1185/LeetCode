class Solution {
    public String reverseStr(String s, int k) {
        char ch[] = s.toCharArray();
        int n = ch.length;
        for(int i = 0; i < n; i += 2*k){
           int j = Math.min(i+k-1,n-1);
           reverseK(i,j,ch);
        }
    return new String(ch);
    }
    public void reverseK(int left, int right, char[] ch){
        while(left < right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
    }
}