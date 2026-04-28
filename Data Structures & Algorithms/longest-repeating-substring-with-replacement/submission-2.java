class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> count = new HashMap<>();
        int l = 0, r = 0, res = 0;
        while(r < s.length()){
            count.put(s.charAt(r),count.getOrDefault(s.charAt(r),0)+1);
            int maxV = 0;
            for(Map.Entry<Character, Integer> entry : count.entrySet()){
                if(maxV < entry.getValue()) maxV = entry.getValue();
            }
            while((r - l + 1) - maxV > k){
                count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
                l++;
            }
            res = Math.max(res, (r-l+1));
            r++;
        }
        return res;
    }
}
