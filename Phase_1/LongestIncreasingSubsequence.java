package phase1;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestIncreasingSubsequence {
	// Function to find length of longest increasing subsequence
		public static int LIS(int[] arr, int i, int n, int prev)
		{
			
			// Base case: nothing is remaining
			if (i == n) {
				return 0;
			}

			// case 1: exclude the current element and process the
			// remaining elements
			int exclude = LIS(arr, i + 1, n, prev);

			// case 2: include the current element if it is greater
			// than previous element in LIS
			int include = 0;
			if (arr[i] > prev) {
				include = 1 + LIS(arr, i + 1, n, arr[i]);
				
			}
			
			
			// return maximum of above two choices
			return Integer.max(include, exclude);
			
			
		}

		// Program for Longest Increasing Subsequence
		public static void main(String[] args)
		{
			// array = [3, 2, 6, 4, 5, 1 ]
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the size of array");
			int n = sc.nextInt();
			
			int arr[] = new int[n];
			System.out.println("Enter the elements of array");
			for(int i =0; i< n; i++) {
				arr[i] = sc.nextInt();
			}
			
			
			System.out.print("Length of the longest increasing subsequence is " 
			+ LIS(arr, 0, arr.length, Integer.MIN_VALUE));
			
		}
}
