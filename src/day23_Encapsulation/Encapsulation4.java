package day23_Encapsulation;

public class Encapsulation4 {

	public static void main(String[] args) {
		Encapsulation03 obj2 = new Encapsulation03();
		System.out.println("account value: " + obj2.getAccount());
		System.out.println("initial value: " + obj2.getInitial());
		System.out.println("male value: " + obj2.isMale());
		obj2.setAccount(6789);
		obj2.setInitial('A');
		obj2.setMale(false);
		System.out.println("updated account value: " + obj2.getAccount());
		System.out.println("updated initial value: " + obj2.getInitial());
		System.out.println("updated male value: " + obj2.isMale());

	}
}