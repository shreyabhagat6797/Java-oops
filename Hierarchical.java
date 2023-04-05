package oop;

class Container {
	 int quantity = 3;
	}

	// child class
	class Light extends Container {
	 int quantity2 = 1;
	}

	// child class
	class Heavy extends Container {
	 int quantity3 = 2;
	}


public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Light l = new Light();
		Heavy h = new Heavy();
		  
		   System.out.println("Heavy containers = " + (l.quantity -l.quantity2));
		   System.out.println("Light containers = " + (h.quantity - h.quantity3));

	}

}
