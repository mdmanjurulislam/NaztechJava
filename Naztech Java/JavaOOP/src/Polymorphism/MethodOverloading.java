package Polymorphism;

public class MethodOverloading {
	static void add(int a, int b) {
		int sum = a+b;
		System.out.println("Addition : "+a+ "+"+b+": "+sum);
	}
	
//	Overloading add method
	static void add(int a, int b, int c) {
		int sum= a+b+c;
		System.out.println("Overloading Addition "+a+ "+"+b+ "+"+c+": "+sum);
	}
}
