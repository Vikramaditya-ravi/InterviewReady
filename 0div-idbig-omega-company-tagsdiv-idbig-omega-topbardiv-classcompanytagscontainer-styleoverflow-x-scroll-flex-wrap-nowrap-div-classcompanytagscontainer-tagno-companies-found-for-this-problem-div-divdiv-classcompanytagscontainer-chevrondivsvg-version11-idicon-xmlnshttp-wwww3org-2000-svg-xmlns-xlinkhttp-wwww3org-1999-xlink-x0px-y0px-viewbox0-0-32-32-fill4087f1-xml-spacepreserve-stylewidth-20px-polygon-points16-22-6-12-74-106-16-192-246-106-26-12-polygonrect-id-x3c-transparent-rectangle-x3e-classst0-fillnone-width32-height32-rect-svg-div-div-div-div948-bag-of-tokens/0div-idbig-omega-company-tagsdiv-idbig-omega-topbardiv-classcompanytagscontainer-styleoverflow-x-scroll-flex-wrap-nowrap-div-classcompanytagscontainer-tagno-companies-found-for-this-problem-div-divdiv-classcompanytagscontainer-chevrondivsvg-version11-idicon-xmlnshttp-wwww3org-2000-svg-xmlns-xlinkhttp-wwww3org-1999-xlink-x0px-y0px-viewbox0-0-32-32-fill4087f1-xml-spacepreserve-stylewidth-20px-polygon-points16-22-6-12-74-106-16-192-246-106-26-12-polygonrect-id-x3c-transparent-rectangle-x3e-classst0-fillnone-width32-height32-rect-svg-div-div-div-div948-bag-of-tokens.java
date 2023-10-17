class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
         int left = 0;
         int right = tokens.length-1;
         int score =0;
         int maxScore= 0;

        while (left <= right){

            while (left < tokens.length && tokens[left] <= power){
                score+=1;
                maxScore = Math.max(score,maxScore);
                power -=tokens[left];
                left++;
            }
            if(score >= 1){
                power+=tokens[right];
                right--;
                score-=1;
            }
            else {
                break;
            }

        }
        return maxScore;
    }
}