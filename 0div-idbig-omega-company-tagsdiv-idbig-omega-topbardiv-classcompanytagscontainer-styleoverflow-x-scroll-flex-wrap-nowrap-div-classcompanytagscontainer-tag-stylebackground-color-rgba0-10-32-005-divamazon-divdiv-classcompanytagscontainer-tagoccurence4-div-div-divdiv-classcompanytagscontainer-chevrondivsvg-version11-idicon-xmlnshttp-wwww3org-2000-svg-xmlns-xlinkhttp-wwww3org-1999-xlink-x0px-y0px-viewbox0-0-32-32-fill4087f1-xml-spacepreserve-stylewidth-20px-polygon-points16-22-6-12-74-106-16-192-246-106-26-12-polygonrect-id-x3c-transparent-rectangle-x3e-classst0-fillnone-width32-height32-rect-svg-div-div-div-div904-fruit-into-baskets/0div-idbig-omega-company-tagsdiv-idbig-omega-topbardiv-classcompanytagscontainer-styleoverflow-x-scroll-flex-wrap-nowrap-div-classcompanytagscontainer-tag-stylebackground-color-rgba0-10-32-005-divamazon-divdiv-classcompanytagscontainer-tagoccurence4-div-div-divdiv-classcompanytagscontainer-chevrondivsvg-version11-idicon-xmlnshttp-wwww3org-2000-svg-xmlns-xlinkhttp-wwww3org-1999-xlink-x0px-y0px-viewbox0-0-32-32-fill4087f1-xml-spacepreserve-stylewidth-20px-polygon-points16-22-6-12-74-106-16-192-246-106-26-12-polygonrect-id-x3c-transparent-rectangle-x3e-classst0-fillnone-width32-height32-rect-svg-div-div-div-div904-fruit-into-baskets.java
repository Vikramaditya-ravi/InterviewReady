class Solution {
    public int totalFruit(int[] fruits) {
        int result = Integer.MIN_VALUE;
         int n =fruits.length;
         if( n <=2){
             return n;
         }
         HashMap<Integer,Integer> map = new HashMap<>();
         int start = 0;

         for (int i = 0; i < n; i++) {
             map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
             if(map.size() < 2){
                              result = Math.max(result,i-start+1);

                 continue;
             }
             while (map.size() > 2){
                 map.put(fruits[start],map.get(fruits[start])-1);
                 if (map.get(fruits[start]) == 0){
                     map.remove(fruits[start]);
                 }
                 start++;
             }
             result = Math.max(result,i-start+1);

         }
         return result;
    }
}