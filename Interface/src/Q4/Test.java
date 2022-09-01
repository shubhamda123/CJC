package Q4;

public class Test implements A,B{

	public void m1()
	{
		System.out.println("m1--A");
	}
	
	
	
	public static void main(String[] args) {
		
		A a=new Test();
		  a.m1();
		  
		B b=new Test();
		b.m1();
		 
	 
	}

}
