//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] matrix = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++)
                    matrix[i][j] = Integer.parseInt(S[j]);
            }
            Solution ob = new Solution();
            int ans = ob.Count(matrix);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
       public static  boolean utility(int i ,int j, int[][] matrix){
        int count = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        if(isValid(i+1,j,n,m) && matrix[i+1][j] == 0){
            count++;
        }
        if(isValid(i-1,j,n,m) && matrix[i-1][j] == 0){
            count++;
        }if(isValid(i,j+1,n,m) && matrix[i][j+1] == 0){
            count++;
        }if(isValid(i,j-1,n,m) && matrix[i][j-1] == 0){
            count++;
        }if(isValid(i+1,j-1,n,m) && matrix[i+1][j-1] == 0){
            count++;
        }if(isValid(i-1,j-1,n,m) && matrix[i-1][j-1] == 0){
            count++;
        }if(isValid(i-1,j+1,n,m) && matrix[i-1][j+1] == 0){
            count++;
        }if(isValid(i+1,j+1,n,m) && matrix[i+1][j+1] == 0){
            count++;
        }
        return count > 0 && count % 2 == 0;


    }

    public static  boolean isValid(int i,int j,int n, int m){
        return i >= 0 && i < n && j >= 0 && j < m;
    }
    public int  Count(int[][] matrix)
    {
        // code here
        int n = matrix.length;
        int m = matrix[0].length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix[i][j] == 1 && utility(i,j,matrix)){
                    count++;
                }

            }
            
        }
        return count;
    }
}