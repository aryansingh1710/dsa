import java.util.Stack;

class Solution {

    public int maximalRectangle(char[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int row = matrix.length;
        int col = matrix[0].length;

        int[] heights = new int[col];

        int ans = 0;

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                if (matrix[i][j] == '0') {
                    heights[j] = 0;
                } else {
                    heights[j]++;
                }
            }

            ans = Math.max(ans, largestRectangleArea(heights));
        }

        return ans;
    }

    public int largestRectangleArea(int[] heights) {

        int ans = 0;
        int n = heights.length;

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && heights[st.peek()] > heights[i]) {

                int index = st.pop();

                int width;

                if (st.isEmpty()) {
                    width = i;
                } else {
                    width = i - st.peek() - 1;
                }

                ans = Math.max(ans, heights[index] * width);
            }

            st.push(i);
        }

        while (!st.isEmpty()) {

            int index = st.pop();

            int width;

            if (st.isEmpty()) {
                width = n;
            } else {
                width = n - st.peek() - 1;
            }

            ans = Math.max(ans, heights[index] * width);
        }

        return ans;
    }
}