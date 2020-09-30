package Introdution;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);

		   
		        int N = scanner.nextInt();
		       boolean a,b;
		        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		        scanner.close();
		        if(N>=2 && N<=5)
		         a= true;
		        else 
		         a= false;
		        if(N>=6 && N<=20)
		         b= true;
		        else 
		         b= false;
		            if(a && N%2==0){
		                System.out.println("Not Weird");
		            }else{
		                System.out.println("Weird");
		            }
		            if( b && N%2==0){
		                System.out.println("Weird");
		            }
		            if( N>20 && N%2==0 ){
		                System.out.println("Not Weird");
		            }
		    }

	}


