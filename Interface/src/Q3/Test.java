package Q3;

public class Test implements I2 {

	public void m1()
	{
		System.out.println("m1--I1");
	}
	
	public void m2()
	{
		System.out.println("m2--I2");
	}
	
	public static void main(String[] args) {
		
		I1 i=new Test();
		   i.m1();
		   
		I2 m=new Test();
		    m.m1();
		    m.m2();
		   
	 Test t=new Test();
	      t.m1();
	      t.m2();
		  
		   
	}
}
