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


public class trial1 extends HttpServlet
{
public void doGet(HttpServletRequest req, HttpServletResponse res)
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
PrintWriter out = res.getWriter();
String n=req.getParameter("name");
String p=req.getParameter("pass");
ResultSet theResult=st.executeQuery("select firstname,password from patient");


con.rollback();
st.close();
Statement st1=con.createStatement();
while(theResult.next()){

   out.println();

   out.println("<TR>");

   out.println("<TD>" + theResult.getString(1) + "</TD>");

   out.println("<TD>" + theResult.getString(2) + "</TD>");

   String s=theResult.getString(2);

   out.println("<TD><a href=" + s + ">" + s + "</a></TD>");

   out.println("</TR>");

  }

  theResult.close();

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