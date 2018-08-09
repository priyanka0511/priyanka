public class Employee4 implements Comparable<Employee4>
{
	int empId;
	String empName;
	int salary;
	String address;
	
	public Employee4(int empId,String empName,int salary,String address)
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
	public int compareTo(Employee4 employee4) 
	{
		return address.compareTo(employee4.address);
	}
}
