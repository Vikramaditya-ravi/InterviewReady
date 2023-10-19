class Solution {
    
     public static String utility(String str){
        int n = str.length();
        if (n == 0) {
            return "";
        }       
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '#') {
                if (st.size() > 0) {
                    st.pop();

                }
            } else {
                st.push(str.charAt(i));
            }
        }

       int size = st.size();

        for (int i = 0; i <size; i++) {
            sb.append(st.pop());

        }
        return sb.toString();
        
    }
    public boolean backspaceCompare(String s, String t) {
        s = utility(s);
        t = utility(t);
        return s.equals(t);
        
    }
}