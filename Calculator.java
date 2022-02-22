package week1.day2;

public class Calculator {
	public void add()
	{
		int num1=1, num2 =2, num3 =3, sum;
		sum= num1+num2+num3;
		System.out.println("Addition is: "+sum); 
	}
	public void sub()
	{
		int num1=1, num2 =2, sub;
		sub= num1-num2;
		System.out.println("Subtraction is: "+sub); 
	}
	public void mul()
	{
		double num1=19.2, num2 =11.4, mul;
		mul= num1*num2;
		System.out.println("Multiplication is: "+mul); 
	}
	public void div()
	{
		float num1=19.555f, num2 =21.666f, div;
		div= num1/num2;
		System.out.println("Division is: "+div); 
	}
}
