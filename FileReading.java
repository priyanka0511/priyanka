import java.io.*;
public class FileReading 
{
	public static void main(String arg[])
	{
		try
		{
			//Creating stream object for reading File
			FileInputStream fis=new FileInputStream("C:\\DT-S190121-122\\MyFile.txt");
		
			//available() method return number of bytes in the File
			int avl=fis.available();
			
			System.out.println("Total Bytes Available in File:"+avl);
			
			//Creating a empty byte array which hold the number of bytes available in the file
			byte buff[]=new byte[avl];
			
			//This method will read the bytes and store into the byte array.
			fis.read(buff,0,avl);
			
			//This is the line code converting the byte array int a string.
			String content=new String(buff);
			
			System.out.println("File Content:"+content);
			
			fis.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
	}
}
