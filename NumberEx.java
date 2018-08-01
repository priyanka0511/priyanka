class NumberEx
{
	public static void main(String[] ar)
	{

	String str = ar[0]; //command line argument value
	
	int i;
	try
	{
		//Integer is wrapper class converting a string into integer type 
		//storing under the int datatype variable 
		i = Integer.parseInt(str);
		System.out.println("i value="+(i*i));
	}
	catch(NumberFormatException ne)
	{
		ne.printStackTrace();
	}

	}
}