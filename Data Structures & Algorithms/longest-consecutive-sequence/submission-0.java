class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(Integer i : nums){
            set.add(i);
        }
        int longest = 0;
        for(Integer i : nums){
            if(!set.contains(i - 1)){
                int length = 1;
                while(set.contains(i + length)){
                    length++;
                }
                longest = Math.max(length, longest);
            }
        }
        return longest;
    }
}
