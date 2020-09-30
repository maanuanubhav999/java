package Introdution;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		String str[]= new String[10];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter ten names: ");
		for(int i=0;i<10;i++) {
			str[i]= sc.next();
		}
		for(int i=0;i<10;i++) {
			for(int j=(i+1);j<10;j++) {
				if( str[i].compareTo(str[j]) >0) {
					String temp = str[i];
					str[i]=str[i+1];
					str[i+1]=str[i];				
					}
			}
		}
		for(int i =0;i<10;i++) {
			System.out.print(str[i]+" ");
		}
	}

}
