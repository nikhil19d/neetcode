class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(Integer key : nums){
            hash.put(key, hash.getOrDefault(key,0)+1);
            if(hash.get(key) > 1) return true;
        }
        return false;
    }
}