package day26_exepcitons;

public class E {

	public static void main(String[] args) {
		String s="";
		try {
			s+="t";
		}catch (Exception e) {
			s+="c";
		} 
		finally {
			s+="f";
		}
		s+="a";
		System.out.println(s);

	}

}
