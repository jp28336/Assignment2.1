import java.util.ArrayList;
import java.util.Scanner;

public class Assignment21 
{
	public static void main(String[] args) 
	{
		String IEEE754SinglePrecision32bit;
		String IEEE754DoublePrecision64bit;
	 
		Scanner scan = new Scanner(System.in);
		double doubleinput;
		ArrayList Arraylist = new ArrayList();
	  
		System.out.println("Enter number for Float (IEEE754 Single precision 32-bit) ");
		System.out.print("and (IEEE754 Double precision 64-bit) conversion: ");
		doubleinput=scan.nextDouble();
		
		if(doubleinput==0)
		{
			IEEE754SinglePrecision32bit="00000000000000000000000000000000";
			IEEE754DoublePrecision64bit="0000000000000000000000000000000000000000000000000000000000000000";
					
			double singledecimalnumber=0;
			double doubledecimalnumber=0;
			
			System.out.println("singledecimalnumber: "+singledecimalnumber);
			System.out.println("doubledecimalnumber: "+doubledecimalnumber);
		}
		else
		{
			String Binary;
			if (doubleinput>=0)
			{
				Binary="0";
			}
			else
			{
				Binary="1";
				doubleinput=doubleinput*-1;
			}
			
			double wholenumbers=doubleinput;
			double decimalnumbers=doubleinput;
			while(decimalnumbers>=1)
			{
				decimalnumbers=decimalnumbers-1;
			}
			while(wholenumbers>=1)
			{
				wholenumbers=wholenumbers-1;
			}
			wholenumbers=doubleinput-wholenumbers;
			
			String j="";
			//System.out.println(wholenumbers);
			
			while(wholenumbers>=1)
			 {
				 if(wholenumbers==1)
				 {
					 j=j+"1";
					 break;
				 }
				 else if (wholenumbers%2==0)
				 {
					 j=j+"0";
					 wholenumbers=wholenumbers/2;
				 }
				 else if (wholenumbers%2==1)
				 {
					 j=j+"1";
					 wholenumbers=wholenumbers-1;
					 wholenumbers=wholenumbers/2;
				 }
				 else
				 {
					 
				 }
			 }
			
			String k="";
			for(int i=j.length()-1;i>-1;i--)
			{
				k=k+j.charAt(i);
			}
			//System.out.println("k: "+k);
			//System.out.println(j);
			//System.out.println(k);
			
			//System.out.println(decimalnumbers);
			
			String twenty3="";
			for(int i=0;i<100;i++)
			{
				decimalnumbers=decimalnumbers*2;
				if(decimalnumbers>=1)
				{
					twenty3=twenty3+"1";
					decimalnumbers=decimalnumbers-1;
				}
				else
				{
					twenty3=twenty3+"0";
				}
			}
			//System.out.println("Fractional Part: "+twenty3);
			
			String numbers3=k+"."+twenty3;
			String numbers4=k+twenty3;
			
			//System.out.println("numbers3: "+numbers3);
			//System.out.println("numbers4: "+numbers4);
			
			int numbers5=0;
			for(int i=0;i<numbers3.length();i++)
			{
				numbers5=numbers5+1;
				if(numbers3.charAt(i)=='.')
				{
					break;
				}
			}
			
			//System.out.println("numbers5: "+numbers5);
			
			String Mantissawith1="";
			for(int i=0;i<numbers4.length();i++)
			{
				if(numbers4.charAt(i)=='1')
				{
					Mantissawith1=numbers4.substring(0, i+1)+"."+numbers4.substring(i+1);
					break;
				}
			}
			//System.out.println("Mantissawith1: "+Mantissawith1);
			int numbers6=0;
			for(int i=0;i<Mantissawith1.length();i++)
			{
				numbers6=numbers6+1;
				if(Mantissawith1.charAt(i)=='.')
				{
					break;
				}
			}
			//System.out.println("numbers6: "+numbers6);
			
			int bias127=127-numbers6+numbers5;
			int bias1023=1023-numbers6+numbers5;
			String binary1023="";
			String binary127="";
			//System.out.println("bias127: "+bias127);
			
			if (bias1023>=1024)
			 {
				 binary1023=binary1023+"1";
				 bias1023=bias1023-1024;
			 }
			 else
			 {			 
				 binary1023=binary1023+"0";
			 }
			 if (bias1023>=512)
			 {
				 binary1023=binary1023+"1";
				 bias1023=bias1023-512;
			 }
			 else
			 {
				 binary1023=binary1023+"0";
			 }
			 if (bias1023>=256)
			 {
				 binary1023=binary1023+"1";
				 bias1023=bias1023-256;
			 }
			 else
			 {
				 binary1023=binary1023+"0";
			 }
			 if (bias1023>=128)
			 {
				 binary1023=binary1023+"1";
				 bias1023=bias1023-128;
			 }
			 else 
			 {
				 binary1023=binary1023+"0";
			 }
			 
			 if (bias1023>=64)
			 {
				 binary1023=binary1023+"1";
				 bias1023=bias1023-64;
			 }
			 else 
			 {
				 binary1023=binary1023+"0";		 
			 }	 	 
			 if (bias1023>=32)
			 {
				 binary1023=binary1023+"1";
				 bias1023=bias1023-32;
			 }
			 else 
			 {
				 binary1023=binary1023+"0";
			 }	
				 
			 if (bias1023>=16)
			 {
				 binary1023=binary1023+"1";
				 bias1023=bias1023-16;
			 }
			 else 
			 {
				 binary1023=binary1023+"0";
			 }	  
			 if (bias1023>=8)
			 {
				 binary1023=binary1023+"1";
				 bias1023=bias1023-8;
			 }
			 else 
			 {
				 binary1023=binary1023+"0";
			 }		 
			 if (bias1023>=4)
			 {
				 binary1023=binary1023+"1";
				 bias1023=bias1023-4;
			 }
			 else 
			 {
				 binary1023=binary1023+"0";
			 }		 
			 if (bias1023>=2)
			 {
				 binary1023=binary1023+"1";
				 bias1023=bias1023-2;
			 }
			 else 
			 {
				 binary1023=binary1023+"0";
			 }		 
			 if (bias1023>=1)
			 {
				 binary1023=binary1023+"1";
				 bias1023=bias1023-1;
			 }
			 else 
			 {
				 binary1023=binary1023+"0";
			 }
			 
			 
			 if (bias127>=128)
			 {
				 binary127=binary127+"1";
				 bias127=bias127-128;
			 }
			 else 
			 {
				 binary127=binary127+"0";
			 }	 
			 if (bias127>=64)
			 {
				 binary127=binary127+"1";
				 bias127=bias127-64;
			 }
			 else 
			 {
				 binary127=binary127+"0";			 
			 }	 	 
			 if (bias127>=32)
			 {
				 binary127=binary127+"1";
				 bias127=bias127-32;
			 }
			 else 
			 {
				 binary127=binary127+"0";
			 }			 
			 if (bias127>=16)
			 {
				 binary127=binary127+"1";
				 bias127=bias127-16;
			 }
			 else 
			 {
				 binary127=binary127+"0";
			 }	 		 
			 if (bias127>=8)
			 {
				 binary127=binary127+"1";
				 bias127=bias127-8;
			 }
			 else 
			 {
				 binary127=binary127+"0";
			 }		 
			 if (bias127>=4)
			 {
				 binary127=binary127+"1";
				 bias127=bias127-4;
			 }
			 else 
			 {
				 binary127=binary127+"0";
			 }		 
			 if (bias127>=2)
			 {
				 binary127=binary127+"1";
				 bias127=bias127-2;
			 }
			 else 
			 {
				 binary127=binary127+"0";
			 }		 
			 if (bias127>=1)
			 {
				 binary127=binary127+"1";
				 bias127=bias127-2;
			 }
			 else 
			 {
				 binary127=binary127+"0";
			 }
			
			 String Mantissa=k+twenty3;
			 IEEE754SinglePrecision32bit=Binary+binary127+Mantissa.substring(numbers6-1,numbers6+22);
			 IEEE754DoublePrecision64bit=Binary+binary1023+Mantissa.substring(numbers6-1,numbers6+51);
			 
		}
		System.out.println("IEEE754SinglePrecision32bit: "+IEEE754SinglePrecision32bit);
		System.out.println("IEEE754DoublePrecision64bit: "+IEEE754DoublePrecision64bit);
		
		String unsignedbit=IEEE754SinglePrecision32bit.substring(0,1);
		String exponent32=IEEE754SinglePrecision32bit.substring(1,9);
		String Mantissa32=IEEE754SinglePrecision32bit.substring(9);
		
		int unsignedbit2=0;
		if(unsignedbit.charAt(0)=='1')
		{
			unsignedbit2=1;
		}
		else
		{
			unsignedbit2=0;
		}
		
		double exponent33=0;
		//System.out.println("exponent32: "+exponent32);
		for(int i=0;i<exponent32.length();i++)
		{
			if(exponent32.charAt(i)=='1')
			{
				int number=7-i;
				//System.out.print("+2^"+number);
				exponent33=exponent33+Math.pow(2, 7-i);
			}
		}
		//System.out.println();
		//System.out.println("exponent33: "+exponent33);
		exponent33=exponent33-127;
		//System.out.println("exponent33: "+exponent33);
		//System.out.println("Mantissa32: "+Mantissa32);
		double decimal=0;
		for(int i=0;i<Mantissa32.length();i++)
		{
			if(Mantissa32.charAt(i)=='1')
			{
				decimal=decimal+Math.pow(2, -i-1);
			}
		}
		//System.out.println("decimal: "+decimal);
		double singledecimalnumber=Math.pow(-1, unsignedbit2)*(1+decimal)*Math.pow(2, exponent33);
		//System.out.println("unsignedbit2: "+unsignedbit2);
		//System.out.println("decimal: "+decimal);
		//System.out.println("exponent33: "+exponent33);
		//System.out.println("singledecimalnumber: "+singledecimalnumber);
		
		System.out.println("singledecimalnumber: "+singledecimalnumber);
		
		String unsignedbit64=IEEE754DoublePrecision64bit.substring(0,1);
		String exponent64=IEEE754DoublePrecision64bit.substring(1,12);
		String Mantissa64=IEEE754DoublePrecision64bit.substring(12);
		
		int unsignedbit64v2=0;
		if (unsignedbit64.charAt(0)=='1')
		{
			unsignedbit64v2=1;
		}
		else
		{
			unsignedbit64v2=0;
		}
		double exponent64v2=0;
		for(int i=0;i<exponent64.length();i++)
		{
			if(exponent64.charAt(i)=='1')
			{
				int number=7-i;
				//System.out.print("+2^"+number);
				exponent64v2=exponent64v2+Math.pow(2, 10-i);
			}
		}
		exponent64v2=exponent64v2-1023;
		double decimal2=0;
		for(int i=0;i<Mantissa64.length();i++)
		{
			if(Mantissa64.charAt(i)=='1')
			{
				decimal2=decimal2+Math.pow(2, -i-1);
			}
		}
		double doubledecimalnumber=Math.pow(-1, unsignedbit64v2)*(1+decimal2)*Math.pow(2, exponent64v2);
		System.out.println("doubledecimalnumber: "+doubledecimalnumber);
	}
}
