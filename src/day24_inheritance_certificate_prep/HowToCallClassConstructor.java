package day24_inheritance_certificate_prep;

public class HowToCallClassConstructor extends HowToCallClassConstructorParent {
	
	public int age=12; 
	public String name="Veli";
	public static void main(String[] args) {
		//HowToCallClassConstructor obj1=new HowToCallClassConstructor();
		HowToCallClassConstructor obj2=new HowToCallClassConstructor(4);
		
		//java selects the constructor according to the parameters
		

	}
	public HowToCallClassConstructor() {
		//this(5);//this is used to call constructors insede the class
		super();
		System.out.println(super.name);//super keyword is used to get data from parent class
		System.out.println(super.num);
		super.add();
		System.out.println("Constructor without parameter");
	}
	public HowToCallClassConstructor(int num) {
		this();// it is must be the first statement in a constructor
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println("Constructor with parameter");
		
	}
}
