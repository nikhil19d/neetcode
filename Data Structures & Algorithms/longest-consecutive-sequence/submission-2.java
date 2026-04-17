class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(Integer i : nums){
            set.add(i);
        }
        int longest = 0;
        for(Integer i : nums){
            if(set.contains(i - 1) == false){
                int len = 1;
                while(set.contains(i + len)){
                    len++;
                }
                longest = Math.max(longest, len);
            }
        }
        return longest;
    }
}
