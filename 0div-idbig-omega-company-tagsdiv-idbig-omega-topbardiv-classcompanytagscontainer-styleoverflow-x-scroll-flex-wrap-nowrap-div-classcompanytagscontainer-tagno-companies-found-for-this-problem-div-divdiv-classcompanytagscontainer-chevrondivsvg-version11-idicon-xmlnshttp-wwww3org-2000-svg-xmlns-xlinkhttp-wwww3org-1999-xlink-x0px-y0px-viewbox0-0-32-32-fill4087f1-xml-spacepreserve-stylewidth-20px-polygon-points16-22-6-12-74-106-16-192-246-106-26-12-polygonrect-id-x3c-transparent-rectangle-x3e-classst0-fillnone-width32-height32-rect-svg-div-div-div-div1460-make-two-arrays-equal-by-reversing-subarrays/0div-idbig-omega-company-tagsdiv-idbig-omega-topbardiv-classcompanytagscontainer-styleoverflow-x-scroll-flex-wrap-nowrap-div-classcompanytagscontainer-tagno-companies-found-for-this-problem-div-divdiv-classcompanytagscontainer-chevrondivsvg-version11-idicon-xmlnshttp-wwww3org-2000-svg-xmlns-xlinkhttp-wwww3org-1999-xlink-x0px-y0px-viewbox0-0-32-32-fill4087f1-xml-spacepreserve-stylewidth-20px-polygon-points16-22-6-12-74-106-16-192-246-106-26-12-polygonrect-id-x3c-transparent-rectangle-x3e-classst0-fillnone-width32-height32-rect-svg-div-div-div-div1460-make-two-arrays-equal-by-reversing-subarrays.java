class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
         Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Iterate through both arrays simultaneously
        for (int i = 0; i < target.length; i++) {
            // Increment count for elements in target
            frequencyMap.merge(target[i], 1, Integer::sum);
            // Decrement count for elements in arr
            frequencyMap.merge(arr[i], -1, Integer::sum);
        }

        // Check if all frequency differences are zero
        return frequencyMap.values().stream().allMatch(count -> count == 0);
    }
}