package DefaultMethod;

public interface Drawable {
	
	void draw();
	default void msg()
	{
		System.out.println("default method");
	}


}
