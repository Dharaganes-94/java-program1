package Basics;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int factorial = 5;
		
		long factResult =1;
		
		for(int i=1; i<=factorial;i++)
		{
	
			factResult=factResult*i;
			
			//facReult=1
			//factResult=1*2=2
			//factResult=2*3=6
			//factResult=6*4=24
			//factResult=24*5=120
		}
		
		System.out.println("The factorial value of the number is  "+factResult);
		
		
		
		

	}

}
