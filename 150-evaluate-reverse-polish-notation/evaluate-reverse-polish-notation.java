class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(String val: tokens) {
            if(val.equals("+") || val.equals("-") || val.equals("*") || val.equals("/")) {
                int b = st.pop();
                int a = st.pop();
                if(val.equals("+")) st.push(a+b);
                else if(val.equals("-")) st.push(a-b);
                else if(val.equals("*")) st.push(a*b);
                else if(val.equals("/")) st.push(a/b);
            } else {
                st.push(Integer.valueOf(val));
            }
        }
        return st.pop();
    }
}