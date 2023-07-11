package Abstraction;

public class Test {
	public static void main(String[] args) {
		
		Car car1 ,car2;
		car1=new BMW();
		System.out.println("Car Name :"+car1.carName("BMW"));
		System.out.println("Car Engine cc :"+car1.engine(2000));
		System.out.println("Car Torque :"+car1.torque(500));
		System.out.println("Car Wheel :"+car1.wheel(4));
		
		System.out.println();
		
		car2= new Audi();
		System.out.println("Car Name :"+car2.carName("Audi"));
		System.out.println("Car Engine cc :"+car2.engine(2500));
		System.out.println("Car Torque :"+car2.torque(700));
		System.out.println("Car Wheel :"+car2.wheel(4));
	}
}
