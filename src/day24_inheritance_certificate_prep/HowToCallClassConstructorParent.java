package day24_inheritance_certificate_prep;

public class HowToCallClassConstructorParent {
	public int num ;
	protected String name="Ali";
	public static void main(String[] args) {
		

	}
	public HowToCallClassConstructorParent() {
		System.out.println("Parent constructor without parameter");
	}
	public void add() {
		System.out.println("method from parent");
	}
}
