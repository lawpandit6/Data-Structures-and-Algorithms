/*
=> Bubble sort is a simple sorting algorithm that
   compares adjacent elements, and swaps them if they are in the wrong order. 
=> It's named "bubble sort" because smaller elements "bubble" to the top of the 
   list as larger elements "sink" to the bottom

=> Time complexity 
	->best-case== O(n)
	->average-case== O(n^2)
	->worst-case== O(n^2)
*/

package in.law.sort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
	public static void main(String[] args) {

		Random r = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = r.nextInt(50);
		}

		System.out.println("Before Sorting ================\n" + Arrays.toString(arr));
		int[] bs = BubbleSort.bubbleSortAsc(arr);
		System.out.println("\nAfter Sorting in Ascending Order===");
		System.out.println(Arrays.toString(bs));
		System.out.println("\nAfter Sorting in Descending Order===");
		int[] ds = BubbleSort.bubbleSortDesc(arr);
		System.out.println(Arrays.toString(ds));
	}

	static int[] bubbleSortAsc(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			boolean status = true;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					status = false;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			if (status == true)
				break;
		}
		return arr;
	}

	static int[] bubbleSortDesc(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
			boolean status = true;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] < arr[j + 1]) {
					status = false;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			if (status)
				break;
		}
		return arr;

	}
}
