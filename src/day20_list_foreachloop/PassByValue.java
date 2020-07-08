package day20_list_foreachloop;

public class PassByValue {

	public static void main(String[] args) {
		int num=5;
		System.out.println(increment(num));
		System.out.println(num);
	}
	public static int increment(int num) {
		num++;
		return num;
	}

}
