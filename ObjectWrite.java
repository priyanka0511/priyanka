import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectWrite 
{
	public static void main(String arg[])
	{
		
		try
		{
			
			FileOutputStream fos=new FileOutputStream("c:\\DT-S190121-122\\empObj.txt");
			ObjectOutputStream objectoutputStream=new ObjectOutputStream(fos);
			
			Employee employeeObj=new Employee();
			employeeObj.setEmpId(1001);
			employeeObj.setEmpName("Tarun");
			employeeObj.setSalary(78000);
			
			objectoutputStream.writeObject(employeeObj);
			
			System.out.println("Object Written to a File:");
			
			objectoutputStream.close();
			fos.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
		
		
	}
}
