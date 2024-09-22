

public class main_rect {

	public static void main(String[] ags) {
		// TODO Auto-generated method stub
		
		Rectangle r1 = new Rectangle(3,4);
		Rectangle r2 = new Rectangle(4,6);	
	
		System.out.println("Starting to draw");
		
		r1.draw();
		String st1 = r1.toString();
		System.out.println(st1);
		
		r2.draw();
		String st2 = r2.toString();
		System.out.println(st2);

		r2.scale(2);
		System.out.println("r2.Rectangle scaled:");
		
		st2 = r2.toString();
		System.out.println(st2);
		
		int area1 = r1.calcArea();
		System.out.println("area1");
		System.out.println(area1);
		
		int area2 = r2.calcArea();
		System.out.println("area2");
		System.out.println(area2);
		
		System.out.println("Sum of areas");
		System.out.println(area1+area2);

		
		int per1 = r1.calcPerimeter();
		System.out.println("Perimeter 1");
		System.out.println(per1);	
		
		int per2 = r2.calcPerimeter();
		System.out.println("Perimeter 2");
		System.out.println(per2);
		
		System.out.println("Sum of perimeters");
		System.out.println(per1+per2);
		
		System.out.println("Circle1 radius is 10");
		Circle c1 = new Circle(10);
		double areaC1 = c1.area();
		System.out.println(areaC1);
		
		System.out.println("Circle2 radius is 5");
		Circle c2 = new Circle(5);
		double areaC2 = c2.area();
		System.out.println(areaC2);
		
		

	}

}                                                          
