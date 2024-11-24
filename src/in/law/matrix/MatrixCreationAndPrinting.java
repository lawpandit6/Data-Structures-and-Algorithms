/*we can initialize a multidimensional matrix in a single line 

int a[][]= {{1,2,3},{4,5,6}};

i'e a[][]={{1,2,3}
          ,{4,5,6}}
          
         it is 2*3 matrix.
         
*/

package in.law.matrix;

import java.util.Scanner;

public class MatrixCreationAndPrinting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row size");
		int rows=sc.nextInt();
		System.out.println("Enter column size");
		int columns=sc.nextInt();
		int arr[][]=new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println("Enter data for ("+i+","+j+") cordinates");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix data are");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
