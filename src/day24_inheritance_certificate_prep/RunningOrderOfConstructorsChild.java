package day24_inheritance_certificate_prep;

public class RunningOrderOfConstructorsChild extends RunningOrderOfConstructorsParent{
 
	
	
	public static void main(String[] args) {
		RunningOrderOfConstructorsChild objChild =new RunningOrderOfConstructorsChild();
		
		

	}
	//Every time Parent constructor runs first
	//if parent constructor doesn't run first we cannot use data inside the parent class
	// then, child constructor rins and be available to use parent data
	
	public RunningOrderOfConstructorsChild() {
		super("Ali"); //super () is used to called parent constructor
		//if you do not user super(),you can use just parent constructor 
		//without parameter
		//super () must be first statment in a constructor every time
		//in child const. you can use super() just one. because, if you use it twice, second one cannot be the first statement
		System.out.println("This is the constructor of Child class.");
	}
	
	
	
}
