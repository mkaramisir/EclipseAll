package day22_stringbuilder;

public class StringbuilderMedhods2 {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("United Kingdom");
		System.out.println(s.length());
		System.out.println(s.indexOf("n"));
		System.out.println(s.lastIndexOf("n"));
		System.out.println(s.charAt(4));
		System.out.println(s.append(" 20").append("20"));
		System.out.println(s.insert(3, "X"));
		System.out.println(s.delete(3, 4));
		System.out.println(s.deleteCharAt(6));
		System.out.println(s.reverse());
		System.out.println(s.toString());
		
		
		}
}
