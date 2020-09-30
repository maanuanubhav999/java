package Introdution;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number of rows in matrix: ");
		 int rows =sc.nextInt();
		 System.out.println("Enter the number of columns in matrix: ");
		 int col = sc.nextInt();
		 int [][] mat1 = new int[rows][col];
		 int [][] mat2 = new int[rows][col];
		 int [][] mat3 = new int[rows][col];
		 System.out.println("Enter the elements in first matrix :");
		 for(int i =0;i<rows;i++) {
			 for(int j=0;j<col;j++) {
				  mat1 [i][j]=sc.nextInt();
			 }
		 }
		 System.out.println("Enter the elements in second matrix :");
		 for(int i =0;i<rows;i++) {
			 for(int j=0;j<col;j++) {
				  mat2 [i][j]=sc.nextInt();
			 }
		 }
		 System.out.println("Result :");
		 for(int i =0;i<rows;i++) {
			 for(int j=0;j<col;j++) {
				 mat3[i][j]= mat1[i][j]+mat2[i][j];	
			 }
		 }
		 for(int i =0;i<rows;i++) {
			 for(int j=0;j<col;j++) {
				System.out.print(mat3[i][j] + " ");	
			 }
			 System.out.println();
		 }
		 
		 
		 
		 
	}

}
