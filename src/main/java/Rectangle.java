

public class Rectangle {
	private int length = 50;
	private int width = 60;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int w, int l) {
		length = l;
		width = w;
	}
	
	public int getLength() {
		return length;
	}
	
	public void draw() {
		for (int i=0 ; i<length ; i++) {
			for (int j=0 ; j<width ; j++) {
				System.out.print('*');
			}
		System.out.println();
		}
	}

	public int calcArea(){
//		System.out.println(length*width);
		return length*width;
	}
	
	public int calcPerimeter() {
//		System.out.println(2*length + 2*width);
		return (2*length + 2*width);
	}
	
	public void scale(int factor) {
		length = factor * length;
		width = factor * width;
	}
	
	public String toString() {
		String s;
		s = "Width is " + Integer.toString(width) + ". Length is " + Integer.toString(length);
		return s;		
	}
	
	
	
	
}
