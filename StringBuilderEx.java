package Basics;

public class StringBuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		sb.append("java");
		sb.append("program");
		System.out.println("String builder--> "+sb);
		
		//Second way of creating StringBuilder
		StringBuilder sb1 = new StringBuilder("java");
		sb1.append("program");
		System.out.println("String builder--> "+sb1);
		
		//Third way. It will create a StringBuilder object to store more than 16 characters
		
		StringBuilder sb2 = new StringBuilder(20);
		sb2.append("is my favorite language");
		System.out.println("String Capacity--> "+sb2);
		
		//Other StringBuilder methods
		
		StringBuilder sb3 = new StringBuilder("hello");
		sb3.insert(5,"java");
		System.out.println("String insert--> "+sb3);
		
		//start index is inclusive but end index is exclusive (endindex-1)
		
		 sb3.delete(5,9);
		 System.out.println("String delete--> "+sb3);
		 
		 sb.replace(0, 4, "python");
		 System.out.println("String Replace--> "+sb);
		 
		 sb.reverse();
		 System.out.println("String reverse--> "+sb);
		 
		//fetch the character from a specified index
		 
		 char ch = sb1.charAt(4);
		 System.out.println("Character -->"+ch);

		 

		 
		 

		 
		 

		 
		 
		 

		 


		


		
		


		
		

		

	}

}
