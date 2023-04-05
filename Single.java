package oop;

class Employee {
	void salary() {
		System.out.println("Salary= 300000");
	}
}

class Programmer extends Employee {
	void bonus() {
		System.out.println("Bonus=40000");
	}
}

public class Single {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer p = new Programmer();
		p.salary();
		p.bonus();

	}
}
