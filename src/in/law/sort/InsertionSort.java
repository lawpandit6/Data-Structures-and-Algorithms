package in.law.sort;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr= {15,2,3,5,8,1};
		arr=sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static int[] sort(int[] arr) {
		//{15,2,3,5,8,1}
		//{0, 1,2,3,4,5}
		
		for (int i = 1; i < arr.length; i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key; 
			
		}
		return arr;
	}
}
