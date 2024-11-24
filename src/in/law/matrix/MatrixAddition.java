/*In 1D matrix :- a[]= {1,2,3,4};
					a.length; It will no.of column in 1D matrix 
				o/p = 4
						
In 2D matrix :-a[][]= {{1,2,3},{5,6,7}};
				      a.length   a[0].length
				      o/p=2		 o/p=3
				    
but in 2D matrix a.length will give no. of rows and a[0].length will give no. of columns
*/


				      

package in.law.matrix;

public class MatrixAddition {

	public static void main(String[] args) throws Exception {

		int a[][] = { { 1, 2 }, { 3, 4 } };// 2*2 matrix
		int b[][] = { { 5, 6 }, { 7, 8 } };// 2*2 matrix

		matrixAddition(a, b);
	}
	
	public static void matrixAddition(int a[][], int b[][]) throws Exception {
		int rows = a.length;// it will give no. of rows
		int columns = a[0].length;// it will give no. of columns
		int c[][] = new int[rows][columns];

		if (a.length == b.length && a[0].length == b[0].length) {
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					c[i][j] = a[i][j] + b[i][j];
					// c[0][0] = a[0][0] + b[0][0];
				}

			}
		} else {
			throw new Exception(
					"Matrix addition not posible b/z number of rows and columns of the both matrix is not same");
		}
		
		System.out.println(c);
	}

}
