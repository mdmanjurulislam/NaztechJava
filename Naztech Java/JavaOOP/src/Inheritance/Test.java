package Inheritance;

public class Test {

	public static void main(String[] args) {
		
//		creating object of Subtraction class
		Subtraction sub = new Subtraction();
		int subtract = sub.sub(10, 5);
		int addition = sub.add(50, 2);
		
		System.out.println("subtract :"+subtract);
		System.out.println("Addition :"+addition);

	}

}
