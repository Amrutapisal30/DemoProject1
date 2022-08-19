import java.sql.*;

public class insertdata {
	public static void main(String[] args)
	{
		try
		{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spark","root","");
	
PreparedStatement stmt=con.prepareStatement("insert into student values(?,?,?,?)");  
stmt.setInt(1,106);//1 specifies the first parameter in the query  
 stmt.setString(2,"Tejas");  
 stmt.setInt(3,23);//1 specifies the first parameter in the query  
 stmt.setString(4,"Mumbai");   


int i=stmt.executeUpdate();
System.out.println(i + "Record Inserted");
con.close();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

}
}
