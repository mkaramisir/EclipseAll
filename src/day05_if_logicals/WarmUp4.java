package day05_if_logicals;

import java.util.Scanner;

public class WarmUp4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter four digits numer.");
		int n1=s.nextInt();
		int first=n1%10;
		int n2=n1/10;
		int second=n2%10;
		int n3= n2/10;
		int third=n3%10;
		int n4=n3/10;
		int fourth=n1/1000;
		System.out.println(""+first+second+third+fourth);
		s.close();
	}

}
