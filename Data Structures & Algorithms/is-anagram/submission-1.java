class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i = 0; i < t.length(); i++){
            if(map.get(t.charAt(i)) == null) return false;
            map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() != 0) return false;
        }
        return true;
    }
}
