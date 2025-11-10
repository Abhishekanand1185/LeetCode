class Solution {
    public int minOperations(int[] nums) {
        int operations = 0;
        Stack<Integer> st = new Stack<>();
        for(int num: nums){
            while(!st.isEmpty() && st.peek() > num){
                st.pop();
            }
            if(num == 0){
                continue;
            }
            if(st.isEmpty() || num > st.peek()){
                st.push(num);
                operations++;
            }
        }
    return operations;
    }
}