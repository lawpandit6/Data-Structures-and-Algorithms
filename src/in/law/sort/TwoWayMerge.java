/*
=> Two way merge is a merging technique in which two sorted are given and we to 
merge two sorted array by putting element in such a way so that merge will be 
sorted.
=> Time complexity = O(n)
=> It will work only when we give sorted array

*/

package in.law.sort;

import java.util.Arrays;

public class TwoWayMerge {
	int i = 0;
	int j = 0;
	int k = 0;
	int[] copy;

	public static void main(String[] args) {
		int[] x = { 2, 4, 8, 11 };
		int[] y = { 14, 56, 98 };
		TwoWayMerge twm = new TwoWayMerge();
		int[] merge = twm.twoWayMerge(x, y);
		System.out.println(Arrays.toString(merge));
	}

	public int[] twoWayMerge(int[] x, int[] y) {
		copy = new int[x.length + y.length];
		while (i < x.length && j < y.length) {
			if (x[i] > y[j]) {
				copy[k] = y[j];
				j++;
				k++;
			} else {
				copy[k] = x[i];
				i++;
				k++;
			}
		}
		while (i < x.length) {
			copy[k] = x[i];
			i++;
			k++;
		}
		while (j < y.length) {
			copy[k] = y[j];
			j++;
			k++;
		}
		return copy;
	}

}
