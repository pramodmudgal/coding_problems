package com.example;

import static java.lang.Math.max;

public class Kadane {

	public static void main(String[] args) {

		int arr[] = { 1, -1, -1, 2, -2, 3 };
		int sum = largestSum(arr);
		System.out.println(sum);
	}

	public static int largestSum(int[] arr) {

		int maxSum = arr[0];
		int currentSum = arr[0];

		for (int i = 1; i < arr.length; i++) {
			currentSum = max(currentSum + arr[i], arr[i]);
			maxSum = max(maxSum, currentSum);
		}

		return maxSum;
	}

}
