package day17_static_arrays;

public class ArrayQuestion03 {

	public static void main(String[] args) {
//		int array[] = { 1, 2, 3, 4, 6 };
//
//		if (array[0] == 6 || array[4] == 6) {
//
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
		System.out.println(isFirstLast6());
				
	}
	public static boolean isFirstLast6() {
		int array[] = { 1, 2, 3, 4, 6 };
		boolean flag=false;
		
		if (array[0] == 6 || array[4] == 6) {
			flag=true;
		}return flag;
		
	} 
}
