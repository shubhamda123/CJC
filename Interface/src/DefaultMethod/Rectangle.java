package DefaultMethod;

public class Rectangle implements Drawable {

	public void draw() {
		
		System.out.println("Drawing Rectangle");
	}
	
	public static void main(String[] args) {
		
		Drawable d=new Rectangle();
				d.draw();
				d.msg();
		       
		
		
	}
}
