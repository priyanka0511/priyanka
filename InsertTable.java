import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class InsertTable 
{

	public static void main(String arg[])
	{
		
		try
		{
			Class.forName("org.h2.Driver");
			
			Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/S190121","dteja","dteja");
			
			PreparedStatement psmt=conn.prepareStatement("insert into Employee values(?,?,?,?)");
			
			int empid,salary;
			String empName,addr;
			
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("Enter the Employee ID");
			empid=scanner.nextInt();
			System.out.println("Enter the Employee Name");
			empName=scanner.next();
			System.out.println("Enter the Employee Address");
			addr=scanner.next();
			System.out.println("Enter the Employee Salary");
			salary=scanner.nextInt();
			
			psmt.setInt(1, empid);
			psmt.setString(2, empName);
			psmt.setString(3, addr);
			psmt.setInt(4, salary);
			
			int row_eff=psmt.executeUpdate();
			
			if(row_eff>0)
				System.out.println("Row is Inserted");
			else
				System.out.println("Problem Arised:");
			
			psmt.close();
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
	}

}

