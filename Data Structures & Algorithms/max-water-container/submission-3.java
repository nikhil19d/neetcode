class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1, max = 0;
        while(l < r){
            int cap = Math.min(heights[l], heights[r]) * (r - l);
            max = Math.max(max, cap);
            if(heights[l] <= heights[r]) l++;
            else if(heights[l] >= heights[r]) r--;
        }
        return max;
    }
}
