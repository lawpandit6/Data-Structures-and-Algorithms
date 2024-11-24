/*===> Binary Search is searching technique in which within less iteration
     we can find the searching element from the list
==> Time complexity is :: log(n)
==> Approach : 1st find the mid by using formula 
				mid=(l+h)/2
				    but in this formula there could be an error called overflow 
				    to overcome from this problem we use generalize formula
				mid=l+(h-l)/2;
*/

package in.law.searching;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

	public static void binarySearch(int[] arr, int data) {
		int l = 0, h = arr.length - 1, index = -1, iteration = 0;
		while (l < h) {
			iteration++;
			int mid = (l + h) / 2;
			if (arr[mid] == data) {
				index = mid;
				break;
			}
			if (arr[mid] > data) {
				h = mid;
			} else {
				l = mid + 1;
			}
		}
		System.out.println("\n" + data + " is available at the index " + index + " in " + iteration + " iteration");
	}

	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = r.nextInt(50);
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		BinarySearch.binarySearch(arr, 30);

	}
}
