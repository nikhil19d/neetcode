class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        for(int i = 0; i < s1.length(); i++){
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }
        int match = 0;
        for(int i = 0; i < 26; i++){
            if(s1Count[i] == s2Count[i]) match++;
        }
        int l = 0;
        for(int i = s1.length(); i < s2.length(); i++){
            if(match == 26) return true;
            int ind = s2.charAt(i) - 'a';
            s2Count[ind]++;
            if(s1Count[ind] == s2Count[ind]) match++;
            else if(s1Count[ind]+1 == s2Count[ind]) match--;
            ind = s2.charAt(l) - 'a';
            s2Count[ind]--;
            if(s1Count[ind] == s2Count[ind]) match++;
            else if(s1Count[ind]-1 == s2Count[ind]) match--;
            l++;
        }
        return match == 26;
    }
}
