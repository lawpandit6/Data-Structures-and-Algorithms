package in.law.patterns;

import java.util.Scanner;

public class StarPatterns {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows::");
		int row=sc.nextInt();
		starPattern(row);
		sc.close();
	}
	public static void starPattern(int row) {
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
