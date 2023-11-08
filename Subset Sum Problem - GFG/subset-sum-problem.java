//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
     static Boolean isSubsetSumMine(int ind, int target, int[] arr, int[][] dp) {
        if (target == 0) {
            return true;
        }
        if (ind == 0) {
            return arr[ind] == target;
        }
        if (dp[ind][target] != -1) {
            return dp[ind][target] == 1;

        }
        boolean Take = false, noTake;
        if (target >= arr[ind]) {
            Take = isSubsetSumMine(ind - 1, target - arr[ind], arr, dp);
        }
        noTake = isSubsetSumMine(ind - 1, target, arr, dp);

        dp[ind][target] = (noTake || Take) ?1:0;
        return noTake || Take ;

    }

    static Boolean isSubsetSum(int N, int[] arr, int sum) {
        // code here
        int[][] dp = new int[N + 1][sum + 1];
        for (int[] num : dp) {
            Arrays.fill(num, -1);
        }

        return isSubsetSumMine(N - 1, sum, arr, dp);
    }
}