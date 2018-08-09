import java.util.*;
public class SetDemo1
{
	public static void main(String arg[])
	{
		LinkedHashSet hashSet=new LinkedHashSet();
		
		hashSet.add("Sudhir");
		hashSet.add("Vinod");
		hashSet.add("Fareed");
		hashSet.add("Mohit");
	
		hashSet.add("Fareed"); //Duplicate Values
		
		System.out.println(hashSet);
		
		
	}
}
