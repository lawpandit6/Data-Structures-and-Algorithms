package in.law.matrix;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		int a[][]= {
					{1,2,3},
					{4,5,6},
					{7,8,9}};
		
		transposeOfMatrix(a);
	}
	
	public static void transposeOfMatrix(int a[][]) {
		
		int rows=a.length;
		int columns=a[0].length;
		
		int b[][]=new int[columns][rows];
		for (int i = 0; i <rows * columns ; i++) {
			
			 int row=i%rows;
			int column=i/rows;
			
			b[column][row]=a[row][column];
		}
		
		System.out.println(a);
		System.out.println(b);
		
		/*
		 * b[][]= { {1,4,7}, 
		 * 			{2,5,8},
		 * 			{3,6,9}};
		 */
		/*
		 * int rows=a.length; int columns=a[0].length;
		 * 
		 * int b[][]=new int[columns][rows];
		 * 
		 * for (int i = 0; i < columns; i++) { for (int j = 0; j < rows; j++) {
		 * b[i][j]=a[j][i]; } } System.out.println(a); System.out.println(b);
		 */
	}

}
