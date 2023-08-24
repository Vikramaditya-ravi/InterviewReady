class Solution {
    public int lengthLongestPath(String input) {
          Deque<Integer> stack = new ArrayDeque<>();
        String[] arr = input.split("\n");
        int maxLen = 0;
        stack.push(0);
        for (String s : arr) {
            int numOfTabs = s.lastIndexOf("\t") + 1;
            int level = numOfTabs + 1;
            while (level < stack.size()) stack.poll();
            int curLen = stack.peek() + s.length() - numOfTabs + 1;
            stack.push(curLen);
            if (s.contains(".")) maxLen = Math.max(maxLen, curLen - 1);
        }
        return maxLen;
    }
}