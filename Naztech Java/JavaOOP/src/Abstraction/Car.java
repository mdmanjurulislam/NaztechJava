package Abstraction;

abstract class Car {
	static String carName(String carname) {
		return carname;
	}
	abstract int engine(int cc);
	abstract int torque(int torq);
	abstract int wheel(int amount);
}

class BMW extends Car{
	
	@Override
	int engine(int cc) {
		return cc;
	}
	@Override
	int torque(int torq) {
		return torq;
	}
	@Override
	int wheel(int amount) {
		return amount;
	}
	
}

class Audi extends Car{

	@Override
	int engine(int cc) {
		return cc;
	}

	@Override
	int torque(int torq) {
		return torq;
	}

	@Override
	int wheel(int amount) {
		return amount;
	}
	
}
