class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        char[] str3 = s3.toCharArray();
        if (str1.length + str2.length != str3.length) {
            return false;
        }
        boolean[][] matrix = new boolean[str1.length + 1][str2.length + 1];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int l = i + j - 1;

                if (i == 0 && j == 0) {
                    matrix[i][j] = true;
                } else if (i == 0) {
                    if (str2[j - 1] == str3[l]) {
                        matrix[i][j] = matrix[i][j - 1];
                    }

                } else if (j == 0) {
                    if (str1[i - 1] == str3[l]) {
                        matrix[i][j] = matrix[i - 1][j];
                    }
                } else {

                    matrix[i][j] = (str1[i - 1] == str3[l] && matrix[i - 1][j]) ||
                           (str2[j - 1] == str3[l] && matrix[i][j - 1]);
                }
            }
        }
        return matrix[str1.length][str2.length];
    }
}