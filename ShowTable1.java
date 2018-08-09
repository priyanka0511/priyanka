import java.sql.*;
public class ShowTable1 
{
	public static void main(String arg[])
	{
		
		try
		{
			Class.forName("org.h2.Driver");
			
			Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/S190121","dteja","dteja");
			
			Statement statement=conn.createStatement();
			
			ResultSet resultSet=statement.executeQuery("select * from Employee");
			
			ResultSetMetaData rsmd=resultSet.getMetaData();
			
			int colcount=rsmd.getColumnCount();
			
			for(int i=1;i<=colcount;i++)
			{
				System.out.print(rsmd.getColumnName(i)+"      ");
			}
			
			System.out.println();
			
			while(resultSet.next())
			{
				System.out.print(resultSet.getInt(1)+"       ");
				System.out.print(resultSet.getString(2)+"       ");
				System.out.print(resultSet.getString(3)+"       ");
				System.out.println(resultSet.getInt(4));
			}
			
			statement.close();
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
		
	}
}

