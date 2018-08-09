import java.io.*;
public class FileWriting 
{
	public static void main(String arg[])
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("c:\\DT-S190121-122\\File.txt");
			
			String str="This is my Sample String";
			
			for(int i=0;i<str.length();i++)
			{
				fos.write(str.charAt(i));
			}
			
			System.out.println("-- The Content of the String Written to File--");
			
			fos.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
	}
}
