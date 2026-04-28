class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> countT = new HashMap<>();
        HashMap<Character, Integer> countS = new HashMap<>();
        int l = 0, resLen = Integer.MAX_VALUE;
        int[] res = {0, 0};
        for(Character c : t.toCharArray()){
            countT.put(c, countT.getOrDefault(c, 0)+1);
        }
        int have = 0, need = countT.size();
        for(int r = 0; r < s.length(); r++){
            Character c = s.charAt(r);
            countS.put(c, countS.getOrDefault(c, 0)+1);
            if(countT.containsKey(c) && countT.get(c) == countS.get(c)) have++;
            while(have == need){
                if((r - l + 1) < resLen){
                    resLen = r - l + 1;
                    res[0] = l;
                    res[1] = r;
                }
                Character leftChar = s.charAt(l);
                countS.put(leftChar, countS.get(leftChar) - 1);
                if(countT.containsKey(leftChar) && countS.get(leftChar) < countT.get(leftChar)) have--;
                l++;
            }
        }
        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0],res[1]+1);
    }
}
