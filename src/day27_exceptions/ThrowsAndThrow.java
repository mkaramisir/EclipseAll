package day27_exceptions;
public class ThrowsAndThrow {
    public static void main(String[] args) {
        //divisionWithThrows(12,0);
        //divisionWithThrow(12,0);
        divisionWithTryCatch(12,0);
    }
    public static void divisionWithThrow(int num1, int num2) {
        if(num2==0) {
            throw new ArithmeticException();
        }else {
            System.out.println(num1/num2);
        }
    }
    
    public static void divisionWithTryCatch(int num1, int num2) {
        try {
            System.out.println(num1/num2);
        }catch(ArithmeticException e) {
            System.out.println("Do not try to divide by zero");
        }
    }
    
    public static void divisionWithThrows(int num1, int num2) throws ArithmeticException{
        System.out.println(num1/num2);
    }
    
    public static void divisionWithTryCatchAndThrows(int num1, int num2) {
        try {
            divisionWithThrows(num1,num2);
        }catch(ArithmeticException e) {
            System.out.println("Do not try to divide by zero");
        }
    }
}

