package day03_cast_inc_dec_concat;

public class Increment {

	public static void main(String[] args) {
		int num1 = 5;
		num1 = num1 + 3;// ===> num1+=3;
		System.out.println(num1);

		int num2 = 12;
		num2 = (num2 + 13) * 2;
		System.out.println(num2);
		
		int a=5;
		a+=4;
		System.out.println(a);
		a*=2;
		System.out.println(a);
		
		int num4=7;
		num4++;//num4=num4+1;  num4+=1;
		System.out.println(num4);
	}

}
