class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<int[]> stack = new ArrayDeque<>();
        int maxArea = 0;
        for(int i = 0; i < heights.length; i++){
            int start = i;
            while(!stack.isEmpty() && heights[i] < stack.peek()[1]){
                int[] e = stack.pop();
                int area = e[1] * (i - e[0]);
                maxArea = Math.max(area, maxArea);
                start = e[0];
            }

            stack.push(new int[]{
                start, heights[i]
            });
        }
        for(int[] pairs : stack){
            maxArea = Math.max(maxArea, pairs[1] * (heights.length - pairs[0]));
        }
        return maxArea;
    }
}
