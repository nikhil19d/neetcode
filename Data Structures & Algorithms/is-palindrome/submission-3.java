class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        String str = s.toLowerCase();
        while(left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(right > left && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--; 
        }
        return true;
    }
}
