class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int l = 0;
        int r = s.length()-1;
        while(l < r) {
            while(l < s.length()-1 && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while(r >= 0 && !Character.isLetterOrDigit(s.charAt(r))) r--;
            if(l < s.length()-1 && r >= 0 && s.charAt(l) != s.charAt(r))return false;
            l++;
            r--;
        }
        return true;
    }
}