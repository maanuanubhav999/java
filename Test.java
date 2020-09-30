package Introdution;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int sum=0,choice;
		Scanner sc =new Scanner(System.in);
		System.out.println("press 1 to print the sum of series: ");
		System.out.println("press 2 for disply series: ");
		choice =sc.nextInt();
		switch(choice) {
		case 1:
			for (int i =1;i<=20;i++) {
				if(i%2==0) {
					sum -= Math.pow(2, i);
				}else {
					sum += Math.pow(2, i);
				}
			}
			System.out.println(sum);
			break;
		case 2:
			int a =1;
			for(int i =0;i<5;i++) {
				for(int j=0;j<=i;j++) {
					System.out.print(a);	
					}
				System.out.print("\t");
			}
		}
	}

}
