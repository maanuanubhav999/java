package Introdution;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int reverse=0,rem,temp=num;
		while(num!=0) {
			rem =num%10;
			reverse =reverse*10+rem;
			num =num/10;
		}
		if(temp ==reverse) {
			System.out.println("the number is palindrome");
		}else
			System.out.println("the number is not palindrome:");
	}

}
