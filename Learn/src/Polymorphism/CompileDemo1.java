package Polymorphism;

public class CompileDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompileDemo1 D1 = new CompileDemo1 ();
		D1.add	(5,5,5);
		D1.add(5, 5);
		D1.add(5555,5656.23);
	}
	
	public void add(int a, int b)
	{
		int c = a+b;
		System.out.println("Sum is" + c);
	}
	
	public void add(int a, int b,int d)
	{
		int c = a+b+d;
		System.out.println("Sum is" + c);
	}

	
	public void add(double a, double b)
	{
		double c = a+b;
		System.out.println("Sum is" + c);
	}
}
