package Basics;

public class ArrayEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =10;
		int[] num1 = new int[5];
		
		num1[0] = 10;
		num1[1] = 20;
		num1[2] = 30;
		num1[3] = 40;
		num1[4] = 50;
		
	    System.out.println(num1[4]);
	    
	    System.out.println("Length of the array is "+num1.length);
	    
	    for (int i=0;i<num1.length;i++)
	    {
	    System.out.println("Array value are--"+num1[i]);	
	    }
		

	}

}
