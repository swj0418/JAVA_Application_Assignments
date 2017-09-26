package prac1;

	class Shape
	{
		protected int x, y;
		
		Shape()
		{
			
		}
		
		public void draw()
		{
			System.out.println("Shape Draw");
		}
		
	}
	
	class Rectangle extends Shape
	{
		private int width, heigth;
		public void draw()
		{
			System.out.println("Rectangle Draw");
		}
	}
	
	class Triangle extends Shape
	{
		private int base, heigth;
		public void draw()
		{
			System.out.println("Tri Draw");
		}
	}
	
	class Circle extends Shape
	{
		private int center, radius;
		public void draw()
		{
			System.out.println("Circle Draw");
		}
	}
	
	
	
public class ShapeTest {
	
	public static void main(String[] ar0)
	{
		Shape s1, s2, s3, s4;
		
		s1 = new Shape();
		s2 = new Rectangle();
		s3 = new Triangle();
		s4 = new Circle();
		
		s1.draw();
		s2.draw();
		s3.draw();
		s4.draw();
	}

}
