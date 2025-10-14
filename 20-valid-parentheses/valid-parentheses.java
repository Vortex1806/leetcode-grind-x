class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int p = 0;

        while(p < s.length()) {
            char ch = s.charAt(p);
            if(ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                if(st.empty())return false;
                if(ch == ')' && st.peek() == '(')st.pop();
                else if(ch == '}' && st.peek() == '{') st.pop();
                else if(ch == ']' && st.peek() == '[')st.pop();
                else return false;
            }
            p++;
        }
        return st.size() == 0;
    }
}