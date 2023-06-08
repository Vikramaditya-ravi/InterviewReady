class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        Set<Integer> st = new HashSet<>();
        Set<Integer> st2 = new HashSet<>();
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                st.add(j + 1);
                st2.add(j + 1);
            }

            for (int j = 0; j < n; j++) {
                st.remove(matrix[i][j]);
                st2.remove(matrix[j][i]);
            }
            if (!st.isEmpty() || !st2.isEmpty()) {
                return false;
            }


        }
        return true;
    }
}