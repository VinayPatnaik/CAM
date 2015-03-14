import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Tests extends HttpServlet{
  public void init(ServletConfig config) throws ServletException{
  super.init(config);
  }
  /**Process the HTTP Get request*/
  public void doPost(HttpServletRequest req, 
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
  String sql = 
  "insert into patient values (?,?,?,?,?,?,?)";
  PreparedStatement pst = 
  connection.prepareStatement(sql);
  pst.setString(1, f);
  pst.setString(2, l);
  pst.setString(3, u);
  pst.setString(4, e);
  pst.setString(5, p);
  pst.setString(6, rp);
  pst.setString(7, pn);
  
  int numRowsChanged = pst.executeUpdate();
  // show that the new account has been created
  out.println(" Hello : ");
  out.println(" '"+u+"'");
  pst.close();
  }
  catch(ClassNotFoundException ex){
  out.println("Couldn't load database driver: " 
  + ex.getMessage());
  }
  catch(SQLException ex){
  out.println("SQLException caught: " 
  + ex.getMessage());
  }
  catch (Exception ex){
  out.println(ex);
  }
  finally {
  // Always close the database connection.
  try {
  if (connection != null) connection.close();
  }
  catch (SQLException ignored){
  out.println(ignored);
  }
  }
  }
}