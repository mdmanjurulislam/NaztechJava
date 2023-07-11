package Polymorphism;

public class Test {
	public static void main(String[] args) {
//		creating an object of MethodOverloading
		MethodOverloading methovl = new MethodOverloading();
		methovl.add(5,20);
		methovl.add(10, 5, 2);
		
		
//		creating an object of MethodOverriding
		MethodOverriding methovr=new MethodOverriding();
		methovr.add(10);
	}
}
