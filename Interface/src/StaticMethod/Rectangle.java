package StaticMethod;

public class Rectangle implements Drawable {
	
	public void draw()
	{
		System.out.println("Draw Rectangle");
	}
	
	public static void main(String[] args) {
		

		Drawable d=new Rectangle();
		d.draw();
		int c=Drawable.cube(5);
		
		System.out.println(c);
		
				
	}

}
