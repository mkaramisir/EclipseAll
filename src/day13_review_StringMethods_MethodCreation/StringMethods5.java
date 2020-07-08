package day13_review_StringMethods_MethodCreation;

public class StringMethods5 {

	public static void main(String[] args) {
		String str = "java says hello world, Java String Totorial";
		//replace first occurance of substring "java" with "JAVA"
		String result= str.replaceFirst("java","JAVA");
		System.out.println(result);//JAVA says hello world, Java string totorial
		String result2 = str.replaceFirst("a", "x");
		System.out.println(result2);
		String result3= str.replaceFirst("\\s", "***");
		System.out.println(result3);
		
		
	}

}
