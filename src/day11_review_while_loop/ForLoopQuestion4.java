package day11_review_while_loop;

public class ForLoopQuestion4 {

	public static void main(String[] args) {
		String num = "123";
		String reveredNum = "";
		for (int i = 1; i <= num.length(); i++) {
			reveredNum = reveredNum + num.charAt(num.length() - i);
		}
		System.out.println(reveredNum);
		int reversedInt=Integer.parseInt(reveredNum);
		
	}

}
