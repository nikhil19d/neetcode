class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(Integer n : nums){
            set.add(n);
        }
        int seq = 0, m = 0;
        for(int n : nums){
            if(!set.contains(n-1)){
                int i = 0;
                while(set.contains(n + i)){
                    seq++;
                    i++;
                }
            }
            m = Math.max(m, seq);
            seq = 0;
        }
        return m;
    }
}
