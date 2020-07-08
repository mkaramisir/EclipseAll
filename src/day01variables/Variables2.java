package day01variables;

public class Variables2 {
	public static void main(String[] args) {
		byte heightOfTree = 87;
		byte heightOfBuilding=80;
		System.out.println(heightOfTree-heightOfBuilding );
		
		short num1=20000,num2=12344;
		System.out.println(num1*num2);
		
		long a =1200868779;
		
		long b=3334422111555333l;
		System.out.println(a+b);
		
		float fl1=1.234567f;
        float fl2=0.123f;
        System.out.println(fl1+fl2);
       
        double h=1.2343,l=2.4545;
        System.out.println(h-l);
        
        int num3=Integer.MIN_VALUE;
        System.out.println(num3);
        
        int num4=Integer.MAX_VALUE;
        System.out.println(num4);
        
        byte g=Byte.MAX_VALUE;
        byte e=Byte.MIN_VALUE;
        System.out.println("minimum value of byte " + e);
        System.out.println("maximum value of byte "+g);
        
        short q=Short.MAX_VALUE,w=Short.MIN_VALUE;
        System.out.println("minimum value of short " + w);
        System.out.println("maximum value of short "+q);
        
        float z=Float.MAX_VALUE,s=Float.MIN_NORMAL;
        System.out.println("minimum value of float " + s);
        System.out.println("maximum value of float "+ z);
        
        double dbl=Double.MAX_VALUE,dbl1=Double.MAX_VALUE;
        System.out.println("minimum value of double " + dbl1);
        System.out.println("maximum value of double"+ dbl);
        
        
	}
}
