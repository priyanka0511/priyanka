import java.io.Serializable;

public class Employee5 implements Serializable
{
	int empId;
	String empName;
	int salary;
	
	//Getter method is used to retrieve the value.
	//This also called as accessor
	public int getEmpId() 
	{
		return empId;
	}
	
	//Setter method is used to assign the value.
	//This is also called mutator
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}	
}

