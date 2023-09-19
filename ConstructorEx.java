package Basics;

public class ConstructorEx {
	
	
	/*
	//Constructor is more like a method
	 * 1. If the method name is similar to the class name, then it is called as constructor
	 * 2. Constructor doesn't have any return type
	 * 3. Constructor cannot have keywords like static, final etc
	 * 
	 */
	
	 ConstructorEx()
	{
		System.out.println("This is a default constructor");
	}
	
	public void normalMethod()
	{
		System.out.println("This is a normal method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorEx obj= new ConstructorEx(); 
		obj.normalMethod();

	}


	}


