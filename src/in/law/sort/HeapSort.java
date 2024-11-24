/*==>Heap Sort :- It follows some step:-
				1) convert the array into MaxHeap
				2) swap the root element with last element and again call heapify 
					method by less length by 1 of array to make sure array is 
					MaxHeap or not 
				
*/
package in.law.sort;

import java.util.Arrays;

public class HeapSort {
	public static void main(String[] args) {
		int[] arr= {5,15,9,21,1,6,4};
		heap(arr);
	}
	public static void heap(int[] a) {
		int n=a.length;
		for(int i=n/2-1;i>=0;i--) {
			heapify(i,a,n);
		}
		
		for(int i=n-1;i>0;i--) {
			int swap=a[i];
			a[i]=a[0];
			a[0]=swap;
			heapify(0,a,i);
		}
		System.out.println(Arrays.toString(a));
	}
	public static int[] heapify(int i,int[] a,int length) {
		int parentPosition=i;
		int lc=2*i+1;
		int rc=2*i+2;
		if(lc<length && a[parentPosition]<a[lc])
			parentPosition=lc;
		if(rc<length && a[parentPosition]<a[rc])
			parentPosition=rc;
		
		if(parentPosition !=i) {
			int swap=a[i];
			a[i]=a[parentPosition];
			a[parentPosition]=swap;
			
			heapify(parentPosition,a,length);
		}
			
		return a;
	}
}
