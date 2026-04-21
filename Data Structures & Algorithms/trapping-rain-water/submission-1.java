class Solution {
    public int trap(int[] height) {
        int[] l = new int[height.length];
        int[] r = new int[height.length];
        int max = 0;
        for(int i = 0; i < height.length; i++){
            max = Math.max(max,height[i]);
            l[i] = max;
        }
        max = 0;
        for(int i = height.length - 1; i >= 0; i--){
            max = Math.max(height[i],max);
            r[i] = max; 
        }
        int area = 0;
        for(int i = 0; i < height.length; i++){
            int block = Math.min(l[i],r[i]) - height[i];
            if(block > 0) area += block;
        }
        return area;
    }
}
