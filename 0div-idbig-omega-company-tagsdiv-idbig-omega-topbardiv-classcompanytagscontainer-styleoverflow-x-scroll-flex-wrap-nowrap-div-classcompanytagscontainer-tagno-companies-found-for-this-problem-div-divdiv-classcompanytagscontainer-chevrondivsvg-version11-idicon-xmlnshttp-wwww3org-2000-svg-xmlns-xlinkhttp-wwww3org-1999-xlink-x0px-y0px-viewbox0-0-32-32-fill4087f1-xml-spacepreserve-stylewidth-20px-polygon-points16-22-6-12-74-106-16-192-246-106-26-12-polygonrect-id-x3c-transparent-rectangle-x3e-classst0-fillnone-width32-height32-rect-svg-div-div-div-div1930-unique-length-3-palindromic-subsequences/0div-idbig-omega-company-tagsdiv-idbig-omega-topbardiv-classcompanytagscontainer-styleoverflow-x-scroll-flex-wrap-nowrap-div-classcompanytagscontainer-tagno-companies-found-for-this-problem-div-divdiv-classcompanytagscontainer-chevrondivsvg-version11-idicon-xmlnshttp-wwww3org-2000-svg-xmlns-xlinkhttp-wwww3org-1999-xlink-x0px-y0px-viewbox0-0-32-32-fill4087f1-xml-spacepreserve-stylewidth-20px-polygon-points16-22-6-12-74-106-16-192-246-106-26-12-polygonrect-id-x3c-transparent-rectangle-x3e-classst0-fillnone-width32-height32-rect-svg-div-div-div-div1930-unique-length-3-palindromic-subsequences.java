class Solution {
    public int countPalindromicSubsequence(String s) {
         int n = s.length();
        int[] first = new int[26];
        int[] last = new int[26];
        
        char[] charArray = s.toCharArray();
        Arrays.fill(first, -1);
        Arrays.fill(last, -1);

        for (int i = 0; i < n; i++) {
            if (first[charArray[i] - 'a'] == -1) {
                first[charArray[i] - 'a'] = i;
            }
            last[charArray[i] - 'a'] = i;
        }
        
        int ans = 0,count = 0;
        boolean[] visited;
        

        for (int i = 0; i < 26; i++) {
            visited= new boolean[26];
            int start = first[i];
            int end = last[i];          
            count = 0;

            for (int j = start + 1; j < end; j++) {
                if (!visited[charArray[j] - 'a']) {
                    visited[charArray[j] - 'a'] = true;
                    count++;
                }
            }
            ans += count;

        }
        return ans;
    }
}