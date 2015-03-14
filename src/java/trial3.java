import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class trial3 extends HttpServlet{
  public void init(ServletConfig config) throws ServletException{
  super.init(config);
  }
  /**Process the HTTP Get request*/
  public void processRequest(HttpServletRequest req, 
  HttpServletResponse res) throws ServletException,
  IOException{
  String connectionURL = "jdbc:odbc:vinay";
  Connection connection=null;
  ResultSet rs;
  res.setContentType("text/html");
  PrintWriter out = res.getWriter();
  //get the variables entered in the form
  String f=req.getParameter("firstname");
String l=req.getParameter("lastname");
String u=req.getParameter("username");
String e=req.getParameter("emailid");
String p=req.getParameter("password");
String rp=req.getParameter("repassword");
String pn=req.getParameter("phno");
  try {
  // Load the database driver
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  // Get a Connection to the database
  connection = DriverManager.getConnection
  (connectionURL, "cam", "cam"); 
  //Add the data into the database
  Statement theStatement= connection.createStatement();

   ResultSet theResult=theStatement.executeQuery("select * from patient"); //Select all records from emaillists table.

  //Fetch all the records and print in table
  while(theResult.next()){

   out.println();

   out.println("<TR>");

   out.println("<TD>" + theResult.getString(1) + "</TD>");

   out.println("<TD>" + theResult.getString(2) + "</TD>");

   String s=theResult.getString(3);

   out.println("<TD><a href=" + s + ">" + s + "</a></TD>");

   out.println("</TR>");

  }

  theResult.close();//Close the result set

  theStatement.close();//Close statement

  connection.close(); //Close database Connection

  }
  catch(Exception ex){

   out.println(ex.getMessage());//Print trapped error.

  }

  out.println("</TABLE></P>");

  out.println("<P>&nbsp;</P></FONT></BODY></HTML>");

 }

  public void destroy(){

  }

}

 