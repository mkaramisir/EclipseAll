package day28_abstraction_interface;

public class AbstractToConcrete {
	   public void add() {
	       System.out.println("Concrete method");
	   }
	}
	abstract class Abs extends AbstractToConcrete{
	    AbstractToConcrete obj1 = new AbstractToConcrete();
	    // obj1.add(); Inside the abstract method you cannot use concrete methods
	    // from other concrete classes
	}
