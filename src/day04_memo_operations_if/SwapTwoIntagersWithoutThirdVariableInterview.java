package day04_memo_operations_if;

import java.util.Scanner;

public class SwapTwoIntagersWithoutThirdVariableInterview {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("please enter two intagers");
		int numA=s.nextInt();
		int numB=s.nextInt();
		System.out.println("before swaping: "+numA+"<==>"+numB);
		numA=numA-numB;
		numB=numA+numB;
		numA=numB-numA;
				System.out.println("after swaping: "+numA+"<==>"+numB);
				s.close();
	}

}
