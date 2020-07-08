package day26_exepcitons;

public class Exceptions4 {

	public static void main(String[] args) {

		indexNum("java", 5);
	}
	//IndexOutOfBoundsException is the parent of StringIndexOutOfBoundsException
	//if you are using many catch blocks do not use prent before child
	
	public static void indexNum(String str, int idx) {
		try {
			System.out.println(str.charAt(idx));
			//System.out.println(idx / 0);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Be careful about the index 1st catch block");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Be careful about the index 2nd catch block");
		} finally {
			System.out.println("You did a good job!");
		}
	}
}
