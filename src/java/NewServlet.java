/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vinay Patnaik
 */
public class NewServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        String connectionURL = "jdbc:odbc:vinay";
  Connection connection=null;
  ResultSet rs;
  res.setContentType("text/html");
  PrintWriter out = res.getWriter();
  //get the variables entered in the form
 
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

 