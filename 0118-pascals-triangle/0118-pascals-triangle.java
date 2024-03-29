class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer>row ,prev = null;

        for (int i = 0; i < numRows; i++) {
            row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(j ==i || j == 0){
                    row.add(1);
                }
                else {
                    row.add(prev.get(j-1)+prev.get(j));
                }
            }
            result.add(row);
            prev = row;
        }
        return result;
        
    }
}