class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        int n = barcodes.length;
        int[] result = new int[n];
        int i =0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int val : barcodes){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, Map.Entry.<Integer, Integer>comparingByValue().reversed());
        
        for(Map.Entry<Integer,Integer> e :list){
            int temp = e.getValue();
            while(temp-->0){
                result[i] = e.getKey();
                i+=2;
                if(i>=n){
                    i =1;
                }
            }
        }
        return result;
        
        
        
        
        
        
    }
}