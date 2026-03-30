class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] lm = new int[n];
        int[] rm = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i<n; i++){
            lm[i] = -1;
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                lm[i] = st.peek();
            }
            st.push(i);
        }
        st.clear();
        for(int i = n-1; i>=0; i--){
            rm[i] = n;
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                rm[i] = st.peek();
            }
            st.push(i);
        }
        int maxA = 0;
        for(int i = 0; i<n; i++){
            lm[i] += 1;
            rm[i] -= 1;
            maxA = Math.max(maxA, heights[i] * (rm[i] - lm[i] +1));
        }
        return maxA;
    }
}
