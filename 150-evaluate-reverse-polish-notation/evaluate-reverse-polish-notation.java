class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> st = new ArrayDeque<Integer>();
        for(String a : tokens) {
            if(a.equals("+") || a.equals("-") || a.equals("*") || a.equals("/")) {
                int second = st.pop();
                int first = st.pop();
                if(a.equals("+")) {
                    st.push(first + second);
                } else if(a.equals("-")) {
                    st.push(first - second);
                } else if(a.equals("*")) {
                    st.push(first * second);
                } else if(a.equals("/")) {
                    if(second == 0) st.push(0);
                    else st.push(first / second);
                }
            } else {
                st.push(Integer.parseInt(a));
            }
        }
        return st.peek();
    }
}