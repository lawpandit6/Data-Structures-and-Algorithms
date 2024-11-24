package in.law.interviewProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueElements {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,1,2,3,45,23,1,3};
		
		//Approach-1 with use set interface
		Set<Integer> s=new HashSet<>();
		for(int i: arr) {
			if(!s.contains(i)) {
				s.add(i);
			}
		}
		System.out.println(s);
		
		//Approach-2 without using any predefine dataStructure
		
		int[] c=new int[arr.length];
		int k=0;
		for (int i = 0; i < arr.length; i++) {
			boolean uniqueElement=false;
			for (int j = 0; j < i; j++) {
				if(arr[i]==arr[j]) {
					uniqueElement=true;
					break;
				}
			}
			if(!uniqueElement) {
				c[k]=arr[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(arr));
		int[] copyOf = Arrays.copyOf(c, k);
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(copyOf));
		
		
	}
}
