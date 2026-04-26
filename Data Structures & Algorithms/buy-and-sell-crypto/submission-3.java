class Solution {
    public int maxProfit(int[] p) {
        int maxProfit = 0, buy = 0;
        for(int i = 1; i < p.length; i++){
            if(p[buy] > p[i]) buy = i;
            else maxProfit = Math.max(maxProfit, p[i] - p[buy]);
        }
        return maxProfit;
    }
}
