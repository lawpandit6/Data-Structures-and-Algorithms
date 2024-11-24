package in.law.tree;

import java.util.Arrays;

public class AddElementToMaxHeap {

	public static void main(String[] args) {
		// this is Max heap
		int[] arr = { 15, 10, 8, 7, 6, 5, 4 };
		int addElement = 20;
		arr = addElementToMaxHeap(addElement, arr);
		System.out.println(Arrays.toString(arr));
	}

	public static int[] addElementToMaxHeap(int newElement, int[] arr) {
		// copy old array to new array by increasing size 1
		int[] b = Arrays.copyOf(arr, arr.length + 1);
		b[b.length - 1] = newElement;

		int lastPosition = b.length - 1;

		while (lastPosition > 0) {
			int parentPosition = (lastPosition - 1) / 2;
			if (b[parentPosition] < b[lastPosition]) {
				int swap = b[parentPosition];
				b[parentPosition] = b[lastPosition];
				b[lastPosition] = swap;
				lastPosition = parentPosition;
			} else {
				break;
			}
		}
		return b;
	}

}
