 import java.io.*;
class FileIOEx1
{

public static void main(String[] ar) throws IOException
{
	//creating a object of fileinput class
	FileInputStream fis = new FileInputStream("D:\\corejava\\First.t	xt");
	
	System.out.println(fis.read());
	fis.close();

}


}