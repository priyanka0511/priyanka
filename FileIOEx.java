import java.io.*;
class FileIOEx
{
public static void main(String arg[])throws IOException
{
FileInputStream fis=new FileInputStream("D:\\corejava\\First.txt");
System.out.println(fis.read())'
fis.close();
}
}
