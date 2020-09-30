package Introdution;

import java.util.Scanner;

public class codeforce {

	public static void main(String[] args) {
		int sum=0, num,rem,l=0,sum2=0;
		Scanner in =new Scanner(System.in);
		num=in.nextInt();
		int copy_num =num;
		while(num!=0) {
			rem=num%10;
			num=num/10;
			sum=sum+rem;
		}
		if(sum%4==0) {
			System.out.println(copy_num);
		}else {
			int n = (sum/4)+1;
			int m = (n*4)-sum;
			 l = copy_num +m;
			 num=l;
		}
			  copy_num =num;
				while(num!=0) {
					rem=num%10;
					num=num/10;
					sum2=sum2+rem;
				}
				if(sum2%4==0) {
					System.out.println(l);
				}else {
				int n_1 = (sum2/4)+1;
				int m_1= (n_1*4)-sum2;
				 l = copy_num +m_1;
				  copy_num =num;
			System.out.println(l);
		
				}

	}

}
