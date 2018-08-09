public class MutableString 
{
	public static void main(String arg[])
	{
		
		StringBuffer sBuffer=new StringBuffer("Harish");
		
		sBuffer.append(" Kumar");
		
		System.out.println("String Buffer Object:"+sBuffer);
		
		StringBuilder sBuilder=new StringBuilder("Karun");
		
		sBuilder.append(" Kumar");
		
		System.out.println("String Builder Object:"+sBuilder);
		
		
	}
}
