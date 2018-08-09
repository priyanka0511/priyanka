public class StringDemo 
{
	public static void main(String arg[])
	{
		String str="Rohit"; //=> String str=new String("Rohit")
		
		System.out.println("Length of the String is:"+str.length());
		
		System.out.println("Length of String Literal :"+"Suraj".length());
		
		System.out.println("Upper Case of String:"+str.toUpperCase());
		
		System.out.println("Lower Case of String:"+str.toLowerCase());
		
		System.out.println("Substring:"+str.substring(0, 3));
		
		byte buff[]= {65,66,67,68,69};
		
		String buffString=new String(buff);
		
		System.out.println("String Created using byte Array:"+buffString);
		
		char array[]= {'S','U','J','I','T'};
		
		String charString=new String(array);
		
		System.out.println("String created using Character Array:"+charString);
		
	}
}

