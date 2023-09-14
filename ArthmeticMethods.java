package Basics;

public class ArthmeticMethods {
	
	public void arthmeticOperation(){
		
		int a= 10;
		int b= 5;
		int c= a+b;
		int d= a-b;
		int e= a*b;
		int f= a/b;
		int g= a%b;
		
		System.out.println("The addition value is  "+c);
		System.out.println("The subtraction value is  "+d);
		System.out.println("The multipilication value is  "+e);
		System.out.println("The division value is  "+f);
		System.out.println("The modulo value is  "+g);

		
	}
	public void arthmeticOperationwithNos(int a,int b)
	
	{
		int c= a+b;
		int d= a-b;
		int e= a*b;
		int f= a/b;
		int g= a%b;		
		
		System.out.println("The addition value is  "+c);
		System.out.println("The subtraction value is  "+d);
		System.out.println("The multipilication value is  "+e);
		System.out.println("The division value is  "+f);
		System.out.println("The modulo value is  "+g);
	
	}
		
	 public static void main(String[]args) {
		// TODO Auto-generated method stub
		ArthmeticMethods methods = new  ArthmeticMethods();
		methods.arthmeticOperation();
		methods.arthmeticOperationwithNos(10,5);

}
	
}

