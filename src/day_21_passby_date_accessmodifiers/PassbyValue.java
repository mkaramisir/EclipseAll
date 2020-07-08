package day_21_passby_date_accessmodifiers;

public class PassbyValue {

	public static void main(String[] args) {
		int num=5;
		System.out.println(increment(num));  //6
		System.out.println(num);   //5
//		num=increment(num);       //6
//		System.out.println(num);
		//  what is pass by value? interview qa
		// java uses coppy of variable value inside the method that ones calls pass by value. 
		
	}
	public static int increment(int num) {
		num++;
		return num;
	}

}
