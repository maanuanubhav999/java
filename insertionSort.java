package Introduction;

import java.util.*;

class InsertionSort{
	final static int size = 5;
    public static void main(String args[]) {
        int[] a = new int[size];

        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < size ; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 1 ; i < size ; i++){
            int j = i-1 , temp = a[i];
            for(; j >= 0 && temp <= a[j] ; j--){
                a[j+1] = a[j];
            }

            a[j+1] = temp;
        }

        for(int i = 0 ; i < size ; i++){
            System.out.print(a[i] + " ");
        }
    }
}