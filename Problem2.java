//TC: O(N*W)
//SC: O(N8W)

import java.io.*;
class Problem2 { 
	static int knapSack(int W, int wt[], int val[], int n) 
	{ 
		//making and initialization dp array
		int dp[] = new int[W +1];


		for (int i=0;i<n+1;i++){
			for(int w=W; w>=0; w--){

				if(wt[i-1]<=w)
					dp[W] = Math.max(dp[w] , dp[w - wt[i-1]] + val[i-1]);
			}
		}
		return dp[W];
		
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		int profit[] = { 60, 100, 120 }; 
		int weight[] = { 10, 20, 30 }; 
		int W = 50; 
		int n = profit.length; 
		System.out.print(knapSack(W, weight, profit, n)); 
	} 
} 

