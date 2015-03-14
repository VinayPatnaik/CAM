import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class test extends HttpServlet{
  public void init(ServletConfig config) throws ServletException{
  super.init(config);
  }
  /**Process the HTTP Get request*/
  public void doPost(HttpServletRequest req, 
  HttpServletResponse res) throws ServletException,
  IOException{
  String connectionURL = "jdbc:mysql://localhost/zulfiqar";
  Connection connection=null;
  ResultSet rs;
  res.setContentType("text/html");
  PrintWriter out = res.getWriter();
  //get the variables entered in the form
  String uId = req.getParameter("userId");
  String fname = req.getParameter("firstname");
  String sname = req.getParameter("surname");
  String address1 = req.getParameter("address1");
  String address2 = req.getParameter("address2");
  String town = req.getParameter("town");
  String county = req.getParameter("country");
  String zipcode = req.getParameter("zipcode"); 
  try {
  // Load the database driver
  Class.forName("org.gjt.mm.mysql.Driver");
  // Get a Connection to the database
  connection = DriverManager.getConnection
  (connectionURL, "root", "admin"); 
  //Add the data into the database
  String sql = 
  "insert into emp_details values (?,?,?,?,?,?,?,?)";
  PreparedStatement pst = 
  connection.prepareStatement(sql);
  pst.setString(1, uId);
  pst.setString(2, fname);
  pst.setString(3, sname);
  pst.setString(4, address1);
  pst.setString(5, address2);
  pst.setString(6, town);
  pst.setString(7, county);
  pst.setString(8, zipcode);
  int numRowsChanged = pst.executeUpdate();
  // show that the new account has been created
  out.println(" Hello : ");
  out.println(" '"+fname+"'");
  pst.close();
  }
  catch(ClassNotFoundException e){
  out.println("Couldn't load database driver: " 
  + e.getMessage());
  }
  catch(SQLException e){
  out.println("SQLException caught: " 
  + e.getMessage());
  }
  catch (Exception e){
  out.println(e);
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