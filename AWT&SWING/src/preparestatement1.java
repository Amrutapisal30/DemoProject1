//insert record using preparedstatement
import java.sql.*; 
public class preparestatement1 {
	public static void main(String args[]){  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
	  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spark","root","");  
		  
PreparedStatement stmt=con.prepareStatement("insert into student values(?,?,?,?)");  
		stmt.setInt(1,5);//1 specifies the first parameter in the query  
	     stmt.setString(2,"sagar");  
	     stmt.setInt(3,23);//1 specifies the first parameter in the query  
	     stmt.setString(4,"nagar");   
		int i=stmt.executeUpdate();  
		System.out.println(i+" records inserted");  
		  
		con.close();  
		 
		}catch(Exception e){ System.out.println(e);
		}  
		 
		}  


}

