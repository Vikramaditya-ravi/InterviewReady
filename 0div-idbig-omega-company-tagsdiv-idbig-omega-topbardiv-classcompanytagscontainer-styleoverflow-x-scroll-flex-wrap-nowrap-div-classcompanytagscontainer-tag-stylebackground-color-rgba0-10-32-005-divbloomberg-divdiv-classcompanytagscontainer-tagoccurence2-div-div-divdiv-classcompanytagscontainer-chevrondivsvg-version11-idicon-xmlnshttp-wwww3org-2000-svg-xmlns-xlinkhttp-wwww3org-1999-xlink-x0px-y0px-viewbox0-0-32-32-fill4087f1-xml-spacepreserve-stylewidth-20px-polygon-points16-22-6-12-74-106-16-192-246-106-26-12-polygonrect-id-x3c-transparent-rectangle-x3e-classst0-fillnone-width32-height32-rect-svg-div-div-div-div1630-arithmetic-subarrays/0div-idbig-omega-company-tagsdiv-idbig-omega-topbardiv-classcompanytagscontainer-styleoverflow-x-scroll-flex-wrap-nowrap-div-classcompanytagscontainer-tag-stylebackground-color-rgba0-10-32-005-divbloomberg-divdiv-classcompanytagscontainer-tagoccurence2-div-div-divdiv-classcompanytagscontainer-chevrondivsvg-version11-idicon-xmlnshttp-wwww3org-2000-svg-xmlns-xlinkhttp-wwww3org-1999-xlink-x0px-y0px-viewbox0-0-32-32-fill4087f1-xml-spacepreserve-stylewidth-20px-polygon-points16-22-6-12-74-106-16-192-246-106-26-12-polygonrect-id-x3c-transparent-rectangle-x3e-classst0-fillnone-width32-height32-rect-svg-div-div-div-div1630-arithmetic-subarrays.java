class Solution {
    public boolean isAP(List<Integer> list) {

        if (list.size() < 2) {
            return false;
        }

        Collections.sort(list);
        int delta = list.get(1) - list.get(0);
        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i + 1) - list.get(i) != delta) {
                return false;
            }
        }
        return true;
    }

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {

        int n = l.length;
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = l[i];
            int end = r[i];
            List<Integer> list = new ArrayList<>();
            for (int j = start; j < end + 1; j++) {
                list.add(nums[j]);
            }
            result.add(isAP(list));
        }
        return result;
    }
}