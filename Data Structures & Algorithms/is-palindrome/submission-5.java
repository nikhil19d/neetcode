class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        String str = s.toLowerCase().strip();
        while(l < r){
            while(l < r && !Character.isLetterOrDigit(str.charAt(l))) l++;
            while(l < r && !Character.isLetterOrDigit(str.charAt(r))) r--;
            if(str.charAt(l) != str.charAt(r)){
                return false;
            }
            l++;
            r--;    
        }
        return true;
    }
}
