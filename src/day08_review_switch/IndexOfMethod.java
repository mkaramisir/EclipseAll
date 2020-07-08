package day08_review_switch;

public class IndexOfMethod {

	public static void main(String[] args) {
		String str = "Missisippi is the river and the longest river";
		int idx = str.indexOf("i ",4);
		// indexOf() gives us the index of first character if there is more than 1 
		// if you look for a character which String does not contain, you will get -1
		System.out.println(idx);
		
		int lastInx=str.lastIndexOf("riv");//lastIndexOf() will give you the last occurrence of the character
		
		System.out.println(lastInx);
			
		System.out.println( );
		
	}

}
