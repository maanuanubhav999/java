package Introdution;
import java.util.*;

public class SwitchCase {

	public static void main(String[] args) {
		int sum =0;
		int num=0,rem=0;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		num =sc.nextInt();
		int temp =num;
		while(num!=0) {
			rem=num%10;
			 num=num/10;
			 sum =sum+rem;
		}
		System.out.println(sum);
		int noOfDigits = (int)Math.log10(temp) +1;   //the no. of digits in any given number = log10(given numbers) +1
		System.out.println("The no. of digites in the number :" + noOfDigits);
	}
}
