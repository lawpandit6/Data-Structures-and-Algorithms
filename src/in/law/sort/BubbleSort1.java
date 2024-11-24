package in.law.sort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort1 {
	public static void main(String[] args) {
		int[] asc = new int[10];
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			asc[i] = r.nextInt(50);
		}
		System.out.println("Before sorting:--------" + Arrays.toString(asc));
		Demo.bubbleSortAsc(asc);
		System.out.println("After sorting in Acs:--" + Arrays.toString(asc));

		// In Descending order
		System.out.println("==================================================");
		int[] desc = new int[10];
		for (int i = 0; i < 10; i++) {
			desc[i] = r.nextInt(50);
		}
		System.out.println("Before sorting:---------" + Arrays.toString(desc));
		Demo.bubbleSortDesc(desc);
		System.out.println("After sorting in Desc:--" + Arrays.toString(desc));
	}
}

class Demo {
	static int[] bubbleSortAsc(int a[]) {
		int i, j, t, n = a.length;
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		return a;
	}

	// In descending order method
	static int[] bubbleSortDesc(int[] a) {
		int t, n = a.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (a[j] < a[j + 1]) {
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		return a;
	}
}
