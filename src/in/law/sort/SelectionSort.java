package in.law.sort;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

	 public static void main(String[] args) {
	        int[] arr = {64, 25, 12, 22, 11};
	        selectionSort(arr);
	        System.out.println("Sorted array: " + Arrays.toString(arr));
	    }

	public static void selectionSort(int[] arr) {
		//{64,25,12,22,11}
		//{0, 1, 2 ,3 ,4 }
		
        int n = arr.length;//5
        for (int i = 0; i < n - 1; i++) {//0<4
            // Find the minimum element in unsorted array
            int minIdx = i;//0
            for (int j = i + 1; j < n; j++) { //4<5
                if (arr[j] < arr[minIdx]) {//11<12
                    minIdx = j; //minInd=4
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

}
