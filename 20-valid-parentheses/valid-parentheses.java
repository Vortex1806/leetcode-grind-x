class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        Deque<Character> st = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else {
                if(st.isEmpty()) {
                    return false;
                }
                if(map.get(st.peek()) == s.charAt(i)) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        if(st.isEmpty())return true;
        return false;
    }
}