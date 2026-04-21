class Solution {
    public int trap(int[] height) {
        int  l = 0, r = height.length - 1, area = 0;
        int maxL = height[l], maxR = height[r];
        while(l < r){
            int block = 0;
            if(maxL < maxR){
                l++;
                block = Math.min(maxL,maxR) - height[l];
            }
            else{
                r--;
                block = Math.min(maxL,maxR) - height[r];
            }
            if(block > 0) area += block;
            maxL = Math.max(maxL, height[l]);
            maxR = Math.max(maxR, height[r]);
        }
        return area;
    }
}
