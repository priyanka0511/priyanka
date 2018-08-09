import java.util.*;
public class EmpCollection1
{
	public static void main(String arg[])
	{
		
		ArrayList<Employee> employeeList=new ArrayList<Employee>();
		
		Employee E1=new Employee(1001,"Suresh",56000,"Delhi");
		employeeList.add(E1);
		Employee E2=new Employee(1003,"Harish",67000,"Mumbai");
		employeeList.add(E2);
		employeeList.add(new Employee(1004,"Rohit",45000,"Delhi"));
		employeeList.add(new Employee(1002,"Kiran",60000,"Chennai"));
		
		System.out.println("Size of EmployeeList:"+employeeList.size());
		
		int options;
		char ch;
		do
		{
			System.out.println("Enter the option by Which it should be Sorted");
			System.out.println("1.Address\t 2.Salary");
			Scanner scanner=new Scanner(System.in);
			options=scanner.nextInt();
			
			if(options==1)
			{
				Collections.sort(employeeList, new SortAddressWise());
			}
			else if(options==2)
			{
				Collections.sort(employeeList,new SortSalaryWise());
			}
			else
			{
				
			}
			
			for(Employee employee:employeeList)
			{
				employee.display();
			}
			
			
			ch=scanner.next().charAt(0);
			
		}while(ch!='N');	
	}
}


