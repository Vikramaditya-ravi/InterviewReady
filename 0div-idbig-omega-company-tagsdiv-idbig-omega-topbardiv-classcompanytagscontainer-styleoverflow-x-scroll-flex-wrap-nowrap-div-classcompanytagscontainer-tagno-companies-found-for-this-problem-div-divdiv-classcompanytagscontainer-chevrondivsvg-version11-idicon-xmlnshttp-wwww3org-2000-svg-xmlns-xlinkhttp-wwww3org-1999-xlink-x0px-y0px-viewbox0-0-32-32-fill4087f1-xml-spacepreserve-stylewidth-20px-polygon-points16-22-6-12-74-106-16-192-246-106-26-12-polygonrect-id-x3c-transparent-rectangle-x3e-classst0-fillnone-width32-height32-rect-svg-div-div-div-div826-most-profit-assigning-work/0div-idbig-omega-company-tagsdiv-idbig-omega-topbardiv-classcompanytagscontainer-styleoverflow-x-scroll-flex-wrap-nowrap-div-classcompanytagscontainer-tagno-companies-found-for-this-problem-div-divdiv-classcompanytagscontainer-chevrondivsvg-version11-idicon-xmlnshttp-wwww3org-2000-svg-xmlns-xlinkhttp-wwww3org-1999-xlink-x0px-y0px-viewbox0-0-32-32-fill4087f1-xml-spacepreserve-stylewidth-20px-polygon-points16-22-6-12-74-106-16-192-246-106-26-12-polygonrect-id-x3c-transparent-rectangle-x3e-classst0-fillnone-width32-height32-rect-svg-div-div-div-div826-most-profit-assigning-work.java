class Solution {
    class Pair{
        int difficulty,profit;
        
        Pair(int difficulty,int profit){
            this.difficulty = difficulty;
            this.profit = profit;
        }
         int getDifficulty(){
            return difficulty;
        }
    }
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        
       int result = 0;

        ArrayList<Pair> list = new ArrayList<>();

        for(int i = 0;i <difficulty.length; i++){
            list.add(new Pair(difficulty[i],profit[i]));
        }
        list.sort(Comparator.comparing(Pair::getDifficulty));      
        int i = 0;
        int currMax = 0;
        Arrays.sort(worker);

        for (int capacity : worker) {
            

           while (i < difficulty.length && capacity >= list.get(i).difficulty){
               currMax = Math.max(currMax,list.get(i++).profit);
           }
            result += currMax;

        }
        return result;
        
    }
}