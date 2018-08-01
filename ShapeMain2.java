public class ShapeMain2
{
	
	public static void showArea(Shape shape)
	{
		if(shape instanceof Rectangle)
		{
		System.out.println("Area of Rectangle:"+shape.area());
		}	
		else if(shape instanceof Triangle)
		{
		System.out.println("Area of Triangle:"+shape.area());	
		}
		else
		{
		System.out.println("Area of Circle:"+shape.area());	
		}
	}
	

	public static void main(String arg[])
	{
		
		ShapeMain.showArea(new Rectangle(10,20));
		
		ShapeMain.showArea(new Circle(5,8));
		
		ShapeMain.showArea(new Triangle(12,14));
	}
}

