package day17_static_arrays;

public class ArrayQuestion00 {

	public static void main(String[] args) {
		// if you use index more than or equal to length of array we will get runtime
		// error. exception
		int myArray[] = new int[4];
		myArray[0] = 6;
		myArray[1] = 2;
		myArray[2] = 1;
		myArray[3] = 2;

		String name[] = { "Sibel", "Ibrahim", "Suleyman", "Cirak" };
		System.out.println(name[0] + ", " + name[1] + ", " + name[2] + ", " + name[3]);

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		for (int j = 0; j < myArray.length; j++) {
			System.out.println(myArray[j]);
		}
		System.out.println("Array length is "+name.length);
	}

}
