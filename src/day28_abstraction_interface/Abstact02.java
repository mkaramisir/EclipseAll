package day28_abstraction_interface;

public abstract class Abstact02 {

	public abstract void abs1();

}

/*
 * abstract class Dog extends Abstact02 { // if child class abstract , no need
 * to inherit abstarct methods public abstract void abs2();
 * 
 * }
 */

class Cat extends Abstact02 {

	public void abs1() {
		System.out.println("I inharit abs1 because Cat is concreate class");

	}
}

class Fish extends Dog {

	// when you extens a abstact class you have to inherit all abstact classes from
	// all parents.
	public void abs2() {
		System.out.println("i inherit abs2 because fisg is  child concrete class");

	}

	public void abs1() {
		System.out.println("i inherit abs1 because fisg is grand child concrete class");
	}
}