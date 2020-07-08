package day22_stringbuilder;

public class Examples {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("aaa").insert(1, "bb").insert(4,"ccc");
		System.out.println(sb);
		
		String s1="java";
		StringBuilder s2=new StringBuilder("java");
		//if(s1==s2)System.out.println("1");
		if(s1.equals(s2))System.out.println("2");
		
	}

}
