package day22_stringbuilder;

public class DifferenceBetweenStringStringBuilderAndStringBuffer {		    
		 
	public static void main(String[] args) 
		    { 
		        String s1 = "Ali";
		        concatByUsingString(s1);  
		        System.out.println("String: " + s1); 
		  
		        StringBuilder s2 = new StringBuilder("Ali"); 
		        concatByUsingStringBuilder(s2);
		        System.out.println("StringBuilder: " + s2); 
		  
		        StringBuffer s3 = new StringBuffer("Ali"); 
		        concatByUsingStringBuffer(s3);  
		        System.out.println("StringBuffer: " + s3); 
		    }   
		    // Concatenates to String 
		    public static void concatByUsingString(String s1) 
		    { 
		        s1 = s1 + "Kemal"; 
		    }  
		    // Concatenates to StringBuilder 
		    public static void concatByUsingStringBuilder(StringBuilder s2) 
		    { 
		        s2.append("Kemal"); 
		    }   
		    // Concatenates to StringBuffer 
		    public static void concatByUsingStringBuffer(StringBuffer s3) 
		    { 
		        s3.append("Kemal"); 
		    } 
				
		
		
		//		StringBuilder sb= new StringBuilder("animals");
//		String sub1=sb.substring(3);
//		System.out.println(sub1);
//		
//		String sub2=sb.substring(2,5);
//		System.out.println(sub2);
//		sb.indexOf("n");
//		
//		int ing =sb.length();
//		System.out.println(ing);
//		
//		char ch=sb.charAt(6);
//		System.out.println(ch);
		

	}


