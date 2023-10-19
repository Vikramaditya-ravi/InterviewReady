class Solution {
    public String removeDuplicates(String str) {
        int n = str.length();
        if (n == 0) {
            return "";
        }
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (st.size() == 0){
                st.push(str.charAt(i));
            }
            else {
                if (str.charAt(i) == st.peek()){
                    st.pop();
                }
                else {
                    st.push(str.charAt(i));
                }
            }
           
        }
        int size = st.size();
        for (int i = 0; i < size; i++) {
            sb.append(st.pop());

        }
        sb.reverse();
        return sb.toString();
        
    }
}