package Introdution;

public class ParametrizedConst {
	int i , j;
	ParametrizedConst(int a, int b){
		i= a;
		j= b;
	}
	public static void main(String[] args) {
		ParametrizedConst ob = new ParametrizedConst(2,3);
		System.out.println(ob.i+ ","+ ob.j);
		
	}

}
