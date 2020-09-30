package Introdution;

import java.util.Scanner;

public class ArrayMultiplication {
	

	public static void main(String[] args) {
		int row1 , col1,row2,col2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows in first matrix : ");
		row1=sc.nextInt();
		System.out.print("Enter the number of columns in first matrix: ");
		col1=sc.nextInt();
		System.out.println("enter the elenments in first matrix: ");
		int matrix1[][]=new int[row1][col1];
		for(int i = 0;i<row1;i++ ) {
			for(int j =0; j<col1;j++) {
				matrix1[i][j]=sc.nextInt();
			}
		}
		System.out.print("Enter the number of rows in second matrix : ");
		row2=sc.nextInt();
		System.out.print("Enter the number of columns in second matrix: ");
		col2=sc.nextInt();
		int matrix2[][]=new int[row2][col2];
		for(int i = 0;i<row2;i++ ) {
			for(int j =0; j<col2;j++) {
				matrix2[i][j]=sc.nextInt();
			}
		}
		int result[][] = new int[col1][row2];
		if(col1==row2) {
			for(int i =0; i<col1;i++) {
				for(int j=0;j<row2;j++) {
					
				}
			}
		}else {
			System.out.println("Matrix multiplication is not possible :)");
		}

	}

}
