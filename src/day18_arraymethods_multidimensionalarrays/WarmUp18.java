package day18_arraymethods_multidimensionalarrays;

public class WarmUp18 {
	static int arr[] = {3,4,5};
    public static void main(String[] args) {
        /*
         Type a program like; given an array whose length is 3, return an array with the elements 
         �rotated left�
         For example; if the array is {1, 2, 3} output will be {2, 3, 1}.
        */
        System.out.print(rotateLeft(arr)[0] + " " + rotateLeft(arr)[1] + " " + rotateLeft(arr)[2]);
    }
    
    public static int[] rotateLeft(int arr[]) {
        int rotatedArr[] = new int[3];      
        rotatedArr[0] = arr[1];
        rotatedArr[1] = arr[2];
        rotatedArr[2] = arr[0];     
        return rotatedArr; 
    }
}

