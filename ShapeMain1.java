public class ShapeMain1
{
	
	public static void showArea(Shape shape)
	{
		System.out.println("Area of Shape:"+shape.area());
	}
	
	public static void main(String arg[])
	{
		
		ShapeMain1.showArea(new Rectangle(10,20));
		
		ShapeMain1.showArea(new Circle(5,8));
		
		ShapeMain1.showArea(new Triangle(12,14));
	}
}
