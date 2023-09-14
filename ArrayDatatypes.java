package Basics;

public class ArrayDatatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float[] f = new float[5];
		
		f[0]=10;
		f[1]=20;
		f[2]=30;
		f[3]=40;
		f[4]=50;
		
		System.out.println(f[4]);
		
		System.out.println("The length of the array is  "+ f.length);
		
		for(int i=0;i<f.length;i++)
		{
        System.out.println("Array values are--"+f[i]);
	}

         char[] c = new char[5];
		
		c[0]='H';
		c[1]='E';
		c[2]='L';
		c[3]='L';
		c[4]='O';
		
		System.out.println(c[2]);
		
		System.out.println("The length of the array is  "+ c.length);
		
		for(int i=0;i<f.length;i++)
		{
        System.out.println("Array values are--"+c[i]);
	}
		
		
		short[] S = {0,1,2,3,4};
		
        System.out.println(S[2]);
		
		System.out.println("The length of the array is  "+ S.length);
		
		for(int i=0;i<f.length;i++)
		{
        System.out.println("Array values are--"+S[i]);
	}
		
		
		long[] l = new long[5];
		
		l[0]=10;
		l[1]=20;
		l[2]=30;
		l[3]=40;
		l[4]=50;
		
        System.out.println(l[2]);
		
		System.out.println("The length of the array is  "+ l.length);
		
		for(int i=0;i<l.length;i++)
		{
        System.out.println("Array values are--"+l[i]);
	}
		
		double[] D = {1.0,2.0,3.0,4.0,5.0};
		
		System.out.println(D[4]);
				
		System.out.println("The length of the array is  "+ D.length);
		
		for(int i=0;i<D.length;i++)
		{
        System.out.println("Array values are--"+D[i]);
	}
		
		byte[] b = new byte[5];
		
		b[0]=10;
		b[1]=20;
		b[2]=30;
		b[3]=40;
		b[4]=50;
		
		System.out.println(b[4]);
		
		System.out.println("The length of the array is  "+ b.length);
		
		for(int i=0;i<b.length;i++)
		{
        System.out.println("Array values are--"+b[i]);
	}
		
	}
}