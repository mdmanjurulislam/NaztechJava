package Inheritance;

public class Addition {
	static int add(int a,int b) {
		return a+b;
	}
}

class Subtraction extends Addition{
	static int sub(int a,int b) {
		return a-b;
	}
}
