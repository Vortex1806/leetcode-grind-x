class Solution {
    public int myAtoi(String s) {
        int ans = 0;
        int i = 0;
        boolean isNeg = false;
        if(s.length() == 0)return 0;

        while(i < s.length() && s.charAt(i) == ' ') i++;

        if(i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            if (s.charAt(i) == '-') isNeg = true; 
            i++;
        }

        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';

            if (ans > (Integer.MAX_VALUE - digit) / 10) {
                return isNeg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            ans = ans * 10 + digit;
            i++;
        }
        return isNeg ? -1 * (ans) : ans;
    }
}