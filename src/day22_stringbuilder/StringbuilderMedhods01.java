package day22_stringbuilder;

public class StringbuilderMedhods01 {

	public static void main(String[] args) {
		StringBuilder s= new StringBuilder("testing");
		System.out.println(s.substring(s.length()-5));
		System.out.println(s.substring(0,5));
		
		StringBuilder sb1= new StringBuilder(9);
		sb1.append("techproed");
		System.out.println(sb1.substring(4));
		System.out.println(sb1.substring(0,5));
	
	}

}
