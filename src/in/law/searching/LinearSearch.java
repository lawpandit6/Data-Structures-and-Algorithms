/*====>Searching Algorithm
-> Searching means finding the element present in the list or not 
   is known as Searching

======================
Types of searching
==================
1) Linear Search
	->Time complexity :
		   worst case : O(n)
2) Binary Search
	->Time complexity :
		   worst case : log(n)
*/

package in.law.searching;

import java.util.Arrays;
import java.util.Random;

public class LinearSearch {

	public static void linearSearch(int[] arr, int data) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == data) {
				index = i;
				break;
			}
		}
		System.out.println("\n"+data + " is available at index " + index);
		

	}

	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = r.nextInt(100);
		}
		System.out.println(Arrays.toString(arr));
		LinearSearch.linearSearch(arr, 20);
	}
}
