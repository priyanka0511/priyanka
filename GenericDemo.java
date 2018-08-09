import java.util.*;
public class GenericDemo 
{
	public static void main(String arg[])
	{
		ArrayList list=new ArrayList();
		
		list.add("Suraj"); 
		list.add("Kiran");
		list.add("Gagan");
		list.add(890);  
		list.add(788);
		list.add(89.7f);
		
		
		String str=(String)list.get(4);
		
		System.out.println(str);	
		
	}
}

