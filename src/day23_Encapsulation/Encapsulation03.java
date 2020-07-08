package day23_Encapsulation;

public class Encapsulation03 {
	private char initial = 'c';
	private long account = 12345;
	private boolean male = true;

	public char getInitial() {
		return initial;
	}

	public void setInitial(char initial) {
		this.initial = initial;
	}

	public long getAccount() {
		return account;
	}

	public void setAccount(long account) {
		this.account = account;
	}

	// for boolean getter method us "is" instead of get
	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public static void main(String[] args) {

	}

}
