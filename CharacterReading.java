import java.io.*;
public class CharacterReading 
{
	
	public static void main(String arg[])
	{
		
		try
		{
			FileReader fileReader=new FileReader("C:\\DT-S190121-122\\MyFile.txt");
			
			char arr[]=new char[40];
			
			int readChars;
			
			while((readChars=fileReader.read(arr,0,40))!=-1)
			{
				
				String content=new String(arr);
				
				System.out.println("Content :"+content);
				
			}
			
			fileReader.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
		
	}	
}


