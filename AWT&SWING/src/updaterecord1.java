import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class updaterecord1 {
public static void main(String args[]){  
		
try
{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spark","root","");  
		 

PreparedStatement stmt=con.prepareStatement("update student set name=?,age=?,city=? where rollno=?");  
stmt.setString(1,"Arati");//1 specifies the first parameter in the query i.e. name  

stmt.setInt(2,43);
stmt.setString(3,"Chennai");
stmt.setInt(4,106);  
		  

		int i=stmt.executeUpdate();  
	System.out.println(i+" records updated");  

		
		  
		con.close();  		
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
}
}
