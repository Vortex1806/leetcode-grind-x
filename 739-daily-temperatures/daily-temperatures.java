class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();
        for(int i = temperatures.length-1 ; i >= 0; i--) {
            if(st.isEmpty() || temperatures[st.peek()] > temperatures[i]) {
                if(st.isEmpty()) ans[i] = 0;
                else ans[i] = 1;
                st.push(i);
            } else {
                while(!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]) {
                    st.pop();
                }
                if (!st.isEmpty()) {
                ans[i] = st.peek() - i;
            } else {
                ans[i] = 0;
            }
                st.push(i);
            }
        }
        return ans;
    }
}