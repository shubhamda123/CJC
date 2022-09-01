package InterfaceExtendInt;

public class Test implements Showable {

	public void show()
	{
		System.out.println("Hello");
	}
	
	public void print()
	{
		System.out.println("Welcome");
	}
	
	public static void main(String[] args) {
		
		Test t=new Test();
		t.show();
		t.print();
		
		Showable s=new Test();
		s.show();
		s.print();
	}
	
}
