package day15_constructor_static_keyword;

public class ObjectCreation03 {
	    int x=5;
	    
	    ObjectCreation03() {
	       System.out.println("-x"+x);
	    }
	    
	    ObjectCreation03(int x) {
	        this();
	       System.out.println("-x"+x);
	    }
	    
	    public static void main(String[] args) {
	        ObjectCreation03 mc1= new ObjectCreation03(4);
	        ObjectCreation03 mc2= new ObjectCreation03();
	    }


}


