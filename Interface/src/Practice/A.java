package Practice;

public interface A {
	
	public static final int a = 15;
	public int a1=10;
	final int b=20;
	 static int b2=10;
	 int a3=40;
	 
	public static void m1()
	 {
		 System.out.println("static method");
	 }

	default void m2()
	{
		System.out.println("default method");
	}
	
	public abstract void m3();
	public abstract void m4();
	public void m5();
	 
}
