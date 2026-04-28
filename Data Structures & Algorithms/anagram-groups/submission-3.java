class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String str = new String(c);
            map.computeIfAbsent(str, k -> new ArrayList<>()).add(strs[i]);
            // map.get(str).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
