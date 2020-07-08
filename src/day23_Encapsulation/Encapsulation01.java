package day23_Encapsulation;

public class Encapsulation01 {
	private String Ccn = "1234567891011121";
	private int Ssn = 123456789;
	private boolean customer = true;


	public static void main(String[] args) {
		/*
		 * OOP===>OBJECT ORIENTED PROGRAMING oop has 4 main fundementals 1- polimorphism
		 * 2- inheritance 3- abstraction 4- encapsulation
		 * 
		 * encapsulation:by using it 1-we hiding the data 2- we can acces the hidden
		 * data for enc. ==>1-data must be private 2-create public methods to acces the
		 * hidden data
		 * 
		 *
		 */

	}

	public String getCcn() {
		return Ccn;
	}

	public int getSsn() {
		return Ssn;
	}
	public boolean isCustomer() {
		return customer;
	}

	public void setCustomer(boolean customer) {
		this.customer = customer;
	}
	

}
