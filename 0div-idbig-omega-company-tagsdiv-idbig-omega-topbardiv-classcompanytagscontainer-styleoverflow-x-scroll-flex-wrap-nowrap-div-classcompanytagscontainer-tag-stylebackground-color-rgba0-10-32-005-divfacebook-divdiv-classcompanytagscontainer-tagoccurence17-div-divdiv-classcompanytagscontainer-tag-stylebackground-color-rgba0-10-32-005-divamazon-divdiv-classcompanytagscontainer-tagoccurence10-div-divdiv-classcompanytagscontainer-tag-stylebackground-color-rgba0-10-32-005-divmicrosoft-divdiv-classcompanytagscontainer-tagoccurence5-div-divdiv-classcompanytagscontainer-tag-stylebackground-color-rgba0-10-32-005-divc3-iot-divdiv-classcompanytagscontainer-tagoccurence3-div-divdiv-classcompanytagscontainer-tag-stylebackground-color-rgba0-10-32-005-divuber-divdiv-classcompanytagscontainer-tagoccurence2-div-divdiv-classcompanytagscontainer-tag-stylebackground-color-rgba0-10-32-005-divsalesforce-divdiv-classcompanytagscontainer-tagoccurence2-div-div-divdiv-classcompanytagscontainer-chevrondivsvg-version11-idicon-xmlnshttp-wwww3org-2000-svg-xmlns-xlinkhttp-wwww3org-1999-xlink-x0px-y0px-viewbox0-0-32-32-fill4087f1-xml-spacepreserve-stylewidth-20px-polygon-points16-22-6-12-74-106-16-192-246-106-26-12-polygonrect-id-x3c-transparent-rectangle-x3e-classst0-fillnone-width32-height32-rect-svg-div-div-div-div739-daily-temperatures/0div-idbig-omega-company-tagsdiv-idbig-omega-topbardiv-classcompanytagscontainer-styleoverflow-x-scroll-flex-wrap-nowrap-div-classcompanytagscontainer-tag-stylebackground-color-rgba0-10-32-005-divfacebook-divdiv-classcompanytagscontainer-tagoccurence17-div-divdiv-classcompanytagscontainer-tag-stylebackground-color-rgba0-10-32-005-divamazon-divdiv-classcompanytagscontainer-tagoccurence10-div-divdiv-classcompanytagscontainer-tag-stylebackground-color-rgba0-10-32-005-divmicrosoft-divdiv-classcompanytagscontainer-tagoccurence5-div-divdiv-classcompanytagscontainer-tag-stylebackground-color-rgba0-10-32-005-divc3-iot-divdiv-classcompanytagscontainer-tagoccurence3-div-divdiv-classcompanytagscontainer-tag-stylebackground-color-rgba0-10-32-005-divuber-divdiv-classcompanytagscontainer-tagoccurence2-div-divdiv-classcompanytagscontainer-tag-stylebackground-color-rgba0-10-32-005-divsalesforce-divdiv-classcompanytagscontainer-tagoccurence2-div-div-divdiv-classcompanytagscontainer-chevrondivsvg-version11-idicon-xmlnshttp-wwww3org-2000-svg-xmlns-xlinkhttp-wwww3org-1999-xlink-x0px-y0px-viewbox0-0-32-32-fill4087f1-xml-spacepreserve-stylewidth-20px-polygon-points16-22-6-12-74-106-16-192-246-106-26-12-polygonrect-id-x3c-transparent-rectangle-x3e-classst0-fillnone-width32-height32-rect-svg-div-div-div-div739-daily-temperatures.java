class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack = new Stack<>();
        int n = temperatures.length;
        int[] res = new int[n];
        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && temperatures[i] >= stack.peek()[0]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                res[i] = stack.peek()[1] - i;
                stack.push(new int[]{temperatures[i], i});
            } else {
                res[i] =0;
                stack.push(new int[]{temperatures[i], i});

            }

        }
        return res;
    }
}