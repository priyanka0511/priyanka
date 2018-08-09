import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectRead 
{
	public static void main(String arg[])
	{
		try
		{
			FileInputStream fis=new FileInputStream("c:\\DT-S190121-122\\empObj.txt");
			
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			Employee employeeObj=(Employee)ois.readObject();
			
			System.out.println("Employee ID:"+employeeObj.getEmpId());
			
			System.out.println("Employee Name:"+employeeObj.getEmpName());
			
			System.out.println("Employee Salary:"+employeeObj.getSalary());
			
			ois.close();
			fis.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured:"+e);
		}
	}
}
