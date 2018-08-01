public class FinalVariable1 
{
	final double PI; //Declartion time
	
	public FinalVariable1()
	{
		PI=3.141;
	}
	
	public double calcArea(double radius)
	{
		//PI=3.142; //Error as PI is final
		
		return PI*radius*radius;
	}
}
