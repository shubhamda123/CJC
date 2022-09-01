package task1;

public class Test implements Printable,Showable {

	
	public void print() {
		
		System.out.println("Hello");
	}
	
	public void m1() {
		
		System.out.println("m1--Showable");
		
	}
	
	public static void main(String[] args) {
		
		Test t=new Test();
				t.print();
				t.m1();
		
		Printable p=new Test();
				p.print();
		
		Showable s=new Test();
				s.print();
				s.m1();
				
			}

}
