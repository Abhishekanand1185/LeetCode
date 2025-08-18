class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for(int i=0; i<=heights.length; i++){
            int temp = 0;
            if(i != heights.length){
                temp = heights[i];
            }

            while(!st.isEmpty() && temp < heights[st.peek()]){
                int tbs = st.pop();
                int nsr = i;
                int x = i - 1;
                int lsr = -1;
                if(!st.isEmpty()){
                    lsr = st.peek();
                }
                int y = lsr + 1;

                int area = heights[tbs]*(x - y + 1);
                ans = Math.max(ans, area);
            }

            st.push(i);
        }
    return ans;
    }
}