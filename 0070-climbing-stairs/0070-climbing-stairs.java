class Solution {
 
     public int climbStairs(int n) {
        if( n <=2 ){
              return n ;
          }
          int x = 1;
          int y = 2;
         for (int i = 3; i < n; i++) {
             int temp = y;
             y = x+y;
             x = temp;

         }
         return (x+y);

    }
}