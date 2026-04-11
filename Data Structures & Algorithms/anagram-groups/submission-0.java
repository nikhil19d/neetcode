class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String value : strs){
            char[] strArr = value.toCharArray();
            Arrays.sort(strArr);
            String str = new String(strArr);
            map.putIfAbsent(str, new ArrayList<>());
            map.get(str).add(value);
        }
        return new ArrayList<>(map.values());
    }
}
