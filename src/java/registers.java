import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class registers extends HttpServlet
{
public void doPost(HttpServletRequest req, HttpServletResponse res)
throws IOException, ServletException
{
res.setContentType("text/html");
PrintWriter pw = res.getWriter();
Connection con;
Statement st = null ;
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con= DriverManager.getConnection("jdbc:odbc:dataconnect","system","system");

String f=req.getParameter("firstname");
String l=req.getParameter("lastname");
String u=req.getParameter("username");
String e=req.getParameter("emailid");
String p=req.getParameter("password");
String rp=req.getParameter("repassword");
String pn=req.getParameter("phno");
st.executeUpdate("INSERT INTO patient VALUES('f','l','u','e','p','rp','pn')");

con.rollback();
st.close();
Statement st1=con.createStatement();
ResultSet rs=st1.executeQuery("SELECT * FROM patient");
pw.println("<h1>Data is created Successfully</h1>");

try
{
con.close();
st.close();
}
catch(SQLException ex)
{
pw.println(ex);
}
}
catch(ClassNotFoundException cx)
{
pw.println(cx);
}
catch(SQLException sx)
{
pw.println(sx);
}
}
}  