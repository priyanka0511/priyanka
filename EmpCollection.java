import java.util.*;
public class EmpCollection
{
	public static void main(String arg[])
	{
		
		TreeSet<Employee> employeeList=new TreeSet<Employee>();
		
		Employee E1=new Employee(1001,"Suresh",56000,"Delhi");
		employeeList.add(E1);
		Employee E2=new Employee(1003,"Harish",67000,"Mumbai");
		employeeList.add(E2);
		employeeList.add(new Employee(1004,"Rohit",45000,"Delhi"));
		employeeList.add(new Employee(1002,"Kiran",60000,"Chennai"));
		
		System.out.println("Size of EmployeeList:"+employeeList.size());
		
		
		for(Employee employee:employeeList)
		{
			employee.display();
		}
		
	}
}

