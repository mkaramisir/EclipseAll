package day09_string_methods_for_loop;

import java.util.Scanner;

public class TaskForAllMethods {

	public static void main(String[] args) {
		/*   a)At least two words with space between them
	 *   b)It should have at least 9 characters in total 
	 *   c)At least one upper case, one lower case, a number, and a special character
	 *   d)At the beginning use one space, at the end use double space
	 *      Note: For every step use your password   
	 * 2) Find the index of the initials of the words in your password
	 * 3) Find the last index of any character which is repeated in your password
	 * 4) Replace * for all numbers in your password
	 * 5) Replace ? for all non-words in your password
	 * 6) Replace // for the second character of your password  
	 * 7) Print your password without any space at the beginning and at the end of the password.
	 *  Find the length of your password before trim and after trim.
	 * 8) Print your password on the console by starting from the 4th character
	 * 9) Print the characters of your password from 2nd character to 7th character 
	 * 10)Print your password on the console like all characters in upper case
	 *11)Print your password on the console like all characters in lower case
      */   
  // Scanner scan = new Scanner(System.in);
		/*
		 * System.out.
		 * println("Enter a password which a)At least two words with space between them\r\n"
		 * + "	 *   b)It should have at least 9 characters in total \r\n" +
		 * "	 *   c)At least one upper case, one lower case, a number, and a special character\r\n"
		 * + "	 *   d)At the beginning use one space, at the end use double space");
		 */
		/*
         * 1) Ask user to enter a password which has 
         *      a)At least two words with space between them
         *      b)It should have at least 9 characters in total 
         *      c)At least one upper case, one lower case, a number, and a special character
         *      d)At the beginning use one space, at the end use double space
         *           Note: For every step use your password 
         *           Example for password: " Hey Come1?  "    
         */
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a password according to the given rules");
            String p = scan.nextLine();
            
         // 2) Find the index of the initials of the words in your password
               //index of the first word is 1.
               int secondInitial = p.indexOf(" ",1)+1;
               System.out.println(secondInitial);
         // 3) Find the last index of any character which is repeated in your password
               int idx1 = p.lastIndexOf('e');
               System.out.println(idx1);
               
         //4) Replace * for all numbers in your password
               String str = p.replaceAll("\\d", "*");
               System.out.println(str);
           
         // 5) Replace ? for all non-words in your password
               String str2 = p.replaceAll("\\W", "?"); // \\w ==> a-z   A-Z  0-9 _
               System.out.println(str2);
        // 6) Replace // for the second character of your password   
               String str3 = p.replace("H","//");
               System.out.println(str3);
          
         // 7) Print your password without any space at the beginning and at the end of the password.
         //    Find the length of your password before trim and after trim.
               System.out.println("Before Trim: " + p.length());  // 13
               System.out.println("After Trim: " + p.trim().length());  // 10
         
         // 8) Print your password on the console by starting from the 4th character
               System.out.println("String after 4th character: "+p.substring(3));
                           
         // 9) Print the characters of your password from 2nd character to 7th character 
               System.out.println(p.substring(1, 7)); //  Hey Come1?  
           
         // 10)Print your password on the console like all characters in upper case
               System.out.println(p.toUpperCase());
         // 11)Print your password on the console like all characters in lower case      
               System.out.println(p.toLowerCase());



	}

}
