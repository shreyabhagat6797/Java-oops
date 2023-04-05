package oop;

class Language {
	  public void displayInfo() {
	    System.out.println("Common English Language");
	  }
	}

	class Java extends Language {
	  @Override
	  public void displayInfo() {
	    System.out.println("Java Programming Language");
	  }
	}

public class Polymorphism_override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java j1 = new Java();
	    j1.displayInfo();

	    Language l1 = new Language();
	    l1.displayInfo();

	}

}
