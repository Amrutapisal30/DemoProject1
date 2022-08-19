import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;
public class Jdbcproject extends JFrame implements ActionListener
{
	
    JFrame jm=new JFrame();
	JTextField text1=new JTextField(10);
	JTextField text2=new JTextField(10);
	JTextField text3=new JTextField(10);
	JTextField text4=new JTextField(10);
	JTextField text5=new JTextField(10);
	
	JLabel l=new JLabel("Student Information");
	JLabel l1=new JLabel("Student RollNo :");
	JLabel l2=new JLabel("Student Name   :");
	JLabel l3=new JLabel("Student Age    :");
	JLabel l4=new JLabel("Student City   :");
	JLabel l5=new JLabel("Student EmailId:");
	JButton btn1,btn2,btn3,btn4;
	


	Jdbcproject()
	{
		btn1=new JButton("Show Records");
		btn2=new JButton("Insert Records");
		btn3=new JButton("Update Records");
		btn4=new JButton("Delete Records");
		add(l);
		l.setBounds(200,20,300,50);
		
		add(l1);
		l1.setBounds(30,100,200,30);
		add(l2);
		l2.setBounds(30,150,200,30);
		add(l3);
		l3.setBounds(30,200,200,30);
		add(l4);
		l4.setBounds(30,250,200,30);
		add(l5);
		l5.setBounds(30,300,200,30);
		
		add(text1);
		text1.setBounds(200,100,200,30);
		add(text2);
		text2.setBounds(200,150,200,30);
		add(text3);
		text3.setBounds(200,200,200,30);
		add(text4);
		text4.setBounds(200,250,200,30);
		add(text5);
		text5.setBounds(200,300,200,30);
		
		add(btn1);
		btn1.setBounds(30,400,200,30);
		add(btn2);
		btn2.setBounds(200,400,200,30);
		add(btn3);
		btn3.setBounds(30,450,200,30);
		add(btn4);
		btn4.setBounds(200,450,200,30);
	
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
	   
	setLayout(null);
	setVisible(true);
	setTitle("Student_Information");
	getContentPane().setBackground(Color.pink);
	setSize(500,600);
		
	}
		
	public static void main(String[] args)
	{
	   new Jdbcproject();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//code for show record
		try
		{
 Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spark","root","");
		   
		   Statement st;
		   if(e.getSource()==btn1)
		   {
			 st=con.createStatement();
			 int rollno=Integer.parseInt(text1.getText());
 ResultSet rs=st.executeQuery("select * from student where rollno='"+rollno+"'");
			 while(rs.next())
			 {
				 String name=rs.getString("name");
				 text2.setText(name);
				 
				 int age=rs.getInt("age");
				 text3.setText(Integer.toString(age));
				 
				 String city=rs.getString("city");
				 text4.setText(city);
				 
				 String gmail=rs.getString("email");
				 text5.setText(gmail);
 JOptionPane.showMessageDialog(null, "Record shows....", "show", JOptionPane.DEFAULT_OPTION);
//				 text1.setText("");
//                 text2.setText("");
//                 text3.setText("");
//                 text4.setText("");
//                 text5.setText("");
			 }
			 

			 
		   }
		   //code for insert data
		   else if(e.getSource()==btn2)
		   {
			   String rno,sname,sage,scity,semail;
			   rno=text1.getText();
			   sname=text2.getText();
               sage=text3.getText();
               scity=text4.getText();
			   semail=text5.getText();
                   
               PreparedStatement pstmt=con.prepareStatement("insert into student (rollno,Name,age,city,email)values(?,?,?,?,?)");

                 pstmt.setString(1,rno);                                               
                 pstmt.setString(2,sname);
			     pstmt.setString(3,sage);
			    pstmt.setString(4,scity);
                 pstmt.setString(5,semail);                 
                 
                  pstmt.executeUpdate();
                                 
                  JOptionPane.showMessageDialog(null, "Record inserted....", "Insert", JOptionPane.DEFAULT_OPTION);
                   text1.setText("");
                   text2.setText("");
                   text3.setText("");
                   text4.setText("");
                   text5.setText("");
                   
                   pstmt.close();
			   
		   }
		   //code for Update data.
		   else if(e.getSource()==btn3)
		   {
			   String rno,sname,sage,scity,semail;
			   rno=text1.getText();
			   sname=text2.getText();
               sage=text3.getText();
               scity=text4.getText();
			   semail=text5.getText();
			   
			   PreparedStatement ps=con.prepareStatement("update student set name='"+sname+"', age='"+sage+"',city='"+scity+"',email='"+semail+"' where rollno='"+rno+"'");
		      ps.execute();
		      JOptionPane.showMessageDialog(null, "Record Updated....", "Update", JOptionPane.DEFAULT_OPTION);
			   text1.setText("");
              text2.setText("");
              text3.setText("");
              text4.setText("");
              text5.setText("");
		   }
		   //code for delete data.
		   else if(e.getSource()==btn4)
		   {
			   int rollno=Integer.parseInt(text1.getText());
				PreparedStatement ps=con.prepareStatement("delete from student where rollno=?");
				
				ps.setInt(1, rollno);
				int i=ps.executeUpdate();
				JOptionPane.showMessageDialog(null,i+ "Record deleted....", "Deleted", JOptionPane.DEFAULT_OPTION);
				text1.setText("");
                text2.setText("");
                text3.setText("");
                text4.setText("");
                text5.setText("");
				 
			 
		   }
		   con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
		
		}
		
	}

	

	
}
