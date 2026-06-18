

class Solution {
    public int largestRectangleArea(int[] heights) {

        int ans = 0;
        int n = heights.length;

        Stack<Integer> st = new Stack();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && heights[st.peek()] > heights[i]) {

                int index = st.pop();

                if (!st.isEmpty()) {
                    ans = Math.max(ans,
                            heights[index] * (i - st.peek() - 1));
                } else {
                    ans = Math.max(ans,
                            heights[index] * i);
                }
            }

            st.push(i);
        }

        while (!st.isEmpty()) {

            int index = st.pop();

            if (!st.isEmpty()) {
                ans = Math.max(ans,
                        heights[index] * (n - st.peek() - 1));
            } else {
                ans = Math.max(ans,
                        heights[index] * n);
            }
        }

        return ans;
    }
}