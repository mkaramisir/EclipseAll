package assignment02;

public class Q11 {
//Type a program to create long, and int variables then, cast their types to short.
	
	public static void main(String[] args) {
		long l = 127897970980l;
		int i = 80;
		short s = (short) l;
		short d = (short) i;

		System.out.println("long to short " + s + "\n" + "int to short " + d);

	}

}
