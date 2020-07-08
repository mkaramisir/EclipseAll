package day12_while_loop_do_while_loop;

import java.util.Scanner;

public class WhileLoopQuestion02 {

	public static void main(String[] args) {
		/*
		 * get string from user. write a java program to count the letters numbers and
		 * other characters of an input string. you use while loop for ex.
		 * "sal 1234 sel" 6 letters --> 4 numbers-->2 other character
		 */
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scan.nextLine();
        str = str.toUpperCase();
        
        int letterFlag = 0;
        int numberFlag = 0;
        int othersFlag = 0;
        int lengthFlag = str.length();
        
        while(lengthFlag>0) {
            
            if(str.charAt(lengthFlag-1)>='A' && str.charAt(lengthFlag-1)<='Z') {
                letterFlag++;
            }else if(str.charAt(lengthFlag-1)>='0' && str.charAt(lengthFlag-1)<='9') {
                numberFlag++;
            }else {
                othersFlag++;
            }
            lengthFlag--;
        }
        System.out.println("The number of letters: " + letterFlag);
        System.out.println("The number of numbers: " + numberFlag);
        System.out.println("The number of others: " + othersFlag);
        scan.close();	}
}
