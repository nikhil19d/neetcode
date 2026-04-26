class Solution {
    public int maxProfit(int[] p) {
        int maxProfit = 0, l = 0, r = 1;
        while(r < p.length){
            if(p[r] > p[l]) maxProfit = Math.max(maxProfit, p[r] - p[l]);
            else l = r;
            r++;
        }
        return maxProfit;
    }
}
