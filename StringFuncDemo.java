public class StringFuncDemo 
{
	public static void main(String arg[])
	{
		
		String record="E1001,Suresh,New Delhi,9881877711,45000";
		
		String splitRecord[]=record.split(",");
		
		System.out.println("Employee Id:"+splitRecord[0]);
		System.out.println("Employee Name:"+splitRecord[1]);
		System.out.println("Employee Address:"+splitRecord[2]);
		System.out.println("Employee Mobile:"+splitRecord[3]);
		System.out.println("Employee Salary:"+splitRecord[4]);
		
		String studentId="S191144300093";
		
		System.out.println("Student Year of Join:"+studentId.substring(1,3));
		
		System.out.println("Student Center ID:"+studentId.substring(3,8));
		
		System.out.println("Student SL #:"+studentId.substring(8));
		
		
	}
}

