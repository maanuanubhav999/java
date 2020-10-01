package Introdution;

public class Student {
	String Name;
	int Age;
	Student(String a , int b){
		Name = a;
		Age = b;
	}
	public static void main(String[] args) {
		Student ajay = new Student("Ajay" , 20);
		Student mohit = new Student("Mohit" , 19) ;
		
		System.out.println("My name is " +ajay.Name+" and my age is  "+ajay.Age);
		System.out.println("\nMy name is " +mohit.Name+" and my age is  "+mohit.Age);

	}

}
