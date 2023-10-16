class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> row,prev = null;
        for(int i = 0; i <=rowIndex; i++ ){
            row = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j ==i || j == 0){
                    row.add(1);
                }
                else{
                    assert prev != null;
                    row.add(prev.get(j-1)+prev.get(j));
                }
            }
            list.add(row);
            prev = row;
        }
        
        return list.get(list.size()-1);
    }
}