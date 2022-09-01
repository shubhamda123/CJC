package Practice;

public class B implements A,B1{
	
	public static void main(String[] args) {
		
	   A a=new B();
	   a.m2();
	   A.m1();
	   
	   System.out.println(A.a);
	   System.out.println(A.a1);
	   System.out.println(A.a3);
	   System.out.println(A.b);
	   System.out.println(A.b2);
	   
	  
	

	
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		
	}
}
