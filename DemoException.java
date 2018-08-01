class DemoException
{
	public static void main(String[] ar)
	{
		int a=10, b=0, c;

		try
		{
		c=a/b;// exception is occured it skip /will not continue the exceution of program and it will throw the exception
	System.out.println("c value="+c);
		
		}
		catch(Exception eobj)
		{
	System.out.println(eobj);	
		}
	}	
}