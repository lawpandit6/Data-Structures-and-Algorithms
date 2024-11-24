package in.law.patterns;

import java.util.Scanner;

public class RightSideStarPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows::");
		int row=sc.nextInt();
		rightSideStarPattern(row);
		sc.close();

	}
	public static void rightSideStarPattern(int row) {
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				if(j>=row+1-i && j<=row )
					System.out.print("*");
				else
					System.out.print(" ");
					
			}
			System.out.println();
		}
	}

}
