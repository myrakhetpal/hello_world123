package Polymorphism;

public class InterfaceDemo2 implements InterfaceDemo1 

{
	public static void main(String[] args){
	InterfaceDemo2 D2 = new InterfaceDemo2();
	D2.sub();
	D2.add(5,4);
}

@Override
public void add(int a , int b) {
	// TODO Auto-generated method stub
	int c = a+b;
	System.out.println("Sum is" + c);
}

@Override
public void sub() {
	// TODO Auto-generated method stub
	System.out.println("demo");
}

@Override
public void add() {
	// TODO Auto-generated method stub
	
}
}
