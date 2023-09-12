package Basics;

public class FactorialObjEx {		
		
		public void factorialCalculation() {
			
			int factorial = 5;
			
			long factResult =1;
			
			for(int i=1; i<=factorial;i++)
			{
		
				factResult=factResult*i;
			}
			
			System.out.println("The factorial value of the number is  "+factResult);
			
		}
		
		public void factorialCalculationwithNos(int num)
		
		{
            long factResult =1;
			
			for(int i=1; i<=num;i++)
			{
		
				factResult=factResult*i;
			}
			
			System.out.println("The factorial value of the number is  "+factResult);
			
		}
		
		
		public static void main(String[] args) {
			
			FactorialObjEx fact = new FactorialObjEx();
			fact.factorialCalculation();
			fact.factorialCalculationwithNos(10);
			
			
			// we can create n no of objects to a class
		      FactorialObjEx fact1= new FactorialObjEx();
		      fact1.factorialCalculation();
			  fact1.factorialCalculationwithNos(10);
						
			  FactorialObjEx fact2= new FactorialObjEx();
			  fact2.factorialCalculation();
			  fact2.factorialCalculationwithNos(12);

		}
		
}



		
	
		
		



