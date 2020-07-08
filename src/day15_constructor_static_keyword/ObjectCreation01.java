package day15_constructor_static_keyword;

public class ObjectCreation01 {
	int price=2000;
	int year=2017;
	String make="Honda";
	String model="Accord";
	String type="sedan";
	public static void main(String[] args) {
		ObjectCreation01 car1= new ObjectCreation01();
		
		System.out.println(car1.price);
		System.out.println(car1.make);
		car1.price=5000;
		System.out.println(car1.price);
		System.out.println(car1.type);
		car1.type="hatchback";
		System.out.println(car1.type);
		
	}

}
