package arrays;

import java.util.Scanner;

public class arrayInputOutput {
	public static int[] takeInput(int arr[],int n){
		Scanner s= new Scanner(System.in);
		int array[]=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=s.nextInt();
		}
		return array;
	}
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
