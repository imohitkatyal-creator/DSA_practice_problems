package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

	
public class arraysBasic {
	static class pair{
		int min;
		int max;
		
	}
	public static int[] swapAlternate(int arr[]) {
	for(int i=1;i<arr.length;i+=2) {
		int temp=arr[i];
		arr[i]=arr[i-1];
		arr[i-1]=temp;
	}
	return arr;
	}
	public static int [] arrangeArray(int n) {
		int arr[]=new int[n];
		int k=1;
		int l=arr.length-1;
		int j=arr.length%2==0?arr.length/2:(arr.length+1)/2;
		System.out.println(j);
		for(int i=0;i<=j;i++) {
			arr[i]=k++;
			if(k>n)
			break;
			arr[l]=k++;
			l--;
		}
		return arr;
	}
	
	public static void findUnique(int arr[]) {
		   HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		   for ( int i : arr) 
		   {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		   }
		   
		   for (Map.Entry<Integer,Integer> entry : map.entrySet()) 
			   if(entry.getValue()>1)
	           System.out.println("Key = " + entry.getKey() +
	                            ", Value = " + entry.getValue());
	   }
	
	public static void findUniqueXOR(int arr[]) {
		int unique=arr[0];
		for (int i=1 ;i<arr.length;i++) {
			unique=unique^i;
		}
		System.out.println(unique);
	}
	
	public static void findDuplicate(int arr[]) {
		int[] newArr=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			newArr[arr[i]]++;
		}
		for(int i=0;i<arr.length;i++) {
			if(newArr[i]>1)
			System.out.println(i);
		}
	}
	public static pair minMax(int arr[]) {
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		pair p=new pair();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=min && arr[i]<max) {
				min=arr[i];
			}else if(arr[i]>min && arr[i]>=max){
				max=arr[i];
			}
		}
		p.min=min;
		p.max=max;
		return p;
	}
	public static int KthSmallest(int arr[],int k) {
		int j;
		Arrays.sort(arr);
		return arr[k];
	}
}
	
