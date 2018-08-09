public class Employee implements Comparable<Employee>
{
	int empId;
	String empName;
	int salary;
	String address;
	
	public Employee(int empId,String empName,int salary,String address)
	{
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		this.address=address;
	}
	
	public void display()
	{
		System.out.println("Employee Id:"+empId);
		System.out.println("Employee Name:"+empName);
		System.out.println("Employee Salary:"+salary);
		System.out.println("Employee Address:"+address);
	}

	@Override
	public int compareTo(Employee employee) 
	{
		if(empId>employee.empId)
			return 1;
		else if(empId<employee.empId)
			return -1;
		else
			return 0;
	}
}

