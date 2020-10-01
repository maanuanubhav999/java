package Introdution;

import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner sc = new Scanner(System.in);
       int a[], b[],c[] = new int[100];
       int size = sc.nextInt();
       for(int i = 0;i<size;i++)
            a[i]= sc.nextInt();
        for(int i = 0;i<size;i++)
            b[i]= sc.nextInt();
        for(int i =0; i<size;i++) {
            c[i]=a[i]+b[i];
            System.out.print(c[i] +" ");
        }
    }
}

