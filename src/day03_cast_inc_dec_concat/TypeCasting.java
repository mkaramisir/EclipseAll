package day03_cast_inc_dec_concat;

public class TypeCasting {

	public static void main(String[] args) {
	byte by=34;
	short sh=by;
	short a=4659;
	int b=a;
	System.out.println(b);
	float c=1.345f;
	double d=c;
	System.out.println(c);
	
	/*short num1=12;
	byte num2=(byte) num1;
	System.out.println(num2);*/
	
	float fl2 = 2.123f;
	int in2= (int) fl2;
	System.out.println("this will be integer "+in2);
	//if you convert a float or double to byte/short/int/long 
	// you will
	
	int in1=56;
	byte byt1=(byte) in1;
	System.out.println(byt1);
	
	int val1 = 5;
	double val2 = 6.2;
	System.out.println(val1+val2);
	// we will see on the screen 2 because data type. 5/2=2.5 
	int h=5/2;
	System.out.println(h);
	
	
	}

}
