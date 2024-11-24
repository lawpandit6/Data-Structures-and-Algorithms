/*MaxHeap := It follow two properties:-
		    1) It should be heap or CBT(complete binary tree)
		    2) Each Parent node should be greater than child node
		   then it is called MaxHeap tree
Note::==>CBT mean 
					1)before h-1 level,it should be FBT(full binary tree)	
					2)at the h level, node should fill from extreme Left and then Right
  (h===>height of a tree/level of tree)
MinHeap := It follow two properties:-
			 1) It should be heap or CBT(complete binary tree)
			 2) Each Parent node should be greater than child node
		   then it is called MinHeap tree
*/
package in.law.tree;

import java.util.Arrays;

public class MaxHeap {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};//7
		heap(arr);
	}
	
	public static void heap(int[] a) {
		int n=a.length;//7
		for(int i=n/2-1;i>=0;i--)//3-1=1
		a=heapify(i,a,n);//(1,a,7)
		System.out.println(Arrays.toString(a));
	}
	public static int[] heapify(int i,int[] a,int lenght) {//(1,a,7)
		int parentPosition=i;//1
		int lc=2*i+1;//3
		int rc=2*i+2;//4
		
		//{5,15,9,21,1,6,4}
		//{0,1 ,2,3 ,4,5,6}
		
		if(lc<lenght && a[parentPosition]<a[lc])//(3<7&& 15<21)
			parentPosition=lc;//pp=3
		if(rc<lenght && a[parentPosition]<a[rc])//(4<7&& 21<1)
			parentPosition=rc;
		if(parentPosition !=i) {//(3 != 1)
			int swap=a[i];//swap=15
			a[i]=a[parentPosition];//a[1]=21
			a[parentPosition]=swap;//a[3]=15
			
			//{5,21,9,15,1,6,4}
			heapify(parentPosition, a, lenght);
			
		}
		return a;
	}
}
