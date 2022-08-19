import java.sql.*; 
public class deletedata {
	public static void main(String args[])
	{  
		try{  
			Class.forName("com.mysql.jdbc.Driver");
			//Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spark","root","");  
			//here sonoo is database name, root is username and password  
		 
PreparedStatement stmt=con.prepareStatement("delete from student where rollno=?");  
			stmt.setInt(1, 5);
			int i=stmt.executeUpdate();  
			System.out.println(i+" records deleted"); 
			
			con.close();  
			}catch(Exception e){ System.out.println(e);
			}  
}
}
