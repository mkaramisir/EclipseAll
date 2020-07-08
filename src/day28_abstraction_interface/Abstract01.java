package day28_abstraction_interface;

public abstract class Abstract01 {

	// if you use abstract keyword do not create body.
	// if you do not use ''abstact'' keyword do not forget to create body.

	public abstract void abs();

	public abstract void abs2();
	//we can create concrete methods indide abstarct class; however,
	//we cannaot create abstact mehods indide the concrete class
	public void concrete () {
		System.out.println("this is not abstact");
	}
}

class Dog extends Abstract01 {

	// if you do not inherit any abstact method fom parent class you will get
	// compile time error
	public void abs() {
		System.out.println("I have to inherit all abstract methods");
	}

	public void abs2() {

		System.out.println("I have to inherit all abstract methods");

	}

}