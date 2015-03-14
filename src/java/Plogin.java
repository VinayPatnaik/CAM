/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vinay Patnaik
 */
public class Plogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
"<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
"<head>\n" +
"<title>Medical Clinic</title>\n" +
"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
"<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" media=\"screen\" />\n" +
"<!--[if IE 6]>\n" +
"<link rel=\"stylesheet\" type=\"text/css\" href=\"iecss.css\" />\n" +
"<![endif]-->\n" +
"\n" +
"</head>\n" +
"    \n" +
"<script>\n" +
"function validate()\n" +
" {\n" +
"/* re =/^[A-Z][a-zA-Z -][0-9]+$/;\n" +
"  \n" +
"      if(document.myform.password.value.match(re)) {\n" +
"        alert(\"Error: password must contain at least one number (0-9)!\");\n" +
"        return true;\n" +
"      }\n" +
"     \n" +
"         else{\n" +
"		 \n" +
"		 }\n" +
"\n" +
" */\n" +
"\n" +
"var x = document.myform.emailid.value;\n" +
" var pass=document.myform.password.value;\n" +
" var repass=document.myform.repassword.value;\n" +
"if(document.myform.firstname.value==\"\")\n" +
"{\n" +
"alert(\"Enter your first name \");\n" +
"document.myform.firstname.focus();\n" +
"return false;\n" +
"}\n" +
"   if(document.myform.lastname.value==\"\")\n" +
"{\n" +
"alert(\"Enter lastname\");\n" +
"document.myform.lastname.focus();\n" +
"return false;\n" +
"}\n" +
"  if(pass==\"\")\n" +
"{\n" +
"alert(\"Enter password\");\n" +
"document.myform.password.focus();\n" +
"return false;\n" +
"}\n" +
"  if(repass==\"\")\n" +
"{\n" +
"alert(\"ReEnter password\");\n" +
"document.myform.re-password.focus();\n" +
"return false;\n" +
"}\n" +
"  if(x==\"\")\n" +
"{\n" +
"alert(\"Enter emailid\");\n" +
"document.myform.emailid.focus();\n" +
"return false;\n" +
"}\n" +
"  if(document.myform.phno.value==\"\")\n" +
"{\n" +
"alert(\"Enter phno\");\n" +
"document.myform.phno.focus();\n" +
"return false;\n" +
"}\n" +
"\n" +
"   if(x!=\"\")\n" +
"   {\n" +
"    var atpos = x.indexOf(\"@\");\n" +
"    var dotpos = x.lastIndexOf(\".\");\n" +
"    if (atpos< 1 || dotpos<atpos+2 || dotpos+2>=x.length) {\n" +
"        alert(\"Not a valid e-mail address\");\n" +
"        return false;\n" +
"    }\n" +
"	}\n" +
"\n" +
" \n" +
" \n" +
"   \n" +
"   \n" +
"}\n" +
"\n" +
"</script>\n" +
"\n" +
"\n" +
"<body>\n" +
"<div id=\"main_container\">\n" +
"\n" +
"  <div class=\"header\">\n" +
"<div class=\"left_header\">\n" +
"<p><h1 style=\"font-family: italic;\n" +
"font-family: italic;\n" +
"color: rgba(0, 0, 0, 0.46);\n" +
"position: absolute;\n" +
"margin-top: 31px;\n" +
"font-size: 34px;\n" +
"padding-left: 110px;\">Cloud assisted mobile health monitoring</h1></p>\n" +
"</div>\n" +
"    <div class=\"right_header\">\n" +
"      <div class=\"top_menu\"> <a href=\"login.html#/\" class=\"login\">login</a> <a href=\"signup.html#/\" class=\"sign_up\">signup</a> </div>\n" +
"      <div id=\"menu\">\n" +
"        <ul>\n" +
"          <li><a class=\"current\" href=\"home.html#/\">Home</a></li>\n" +
"          <li><a href=\"#/\">About Us</a></li>\n" +
"          <li><a href=\"#/\">Services</a></li>\n" +
"          <li><a href=\"#/\">Contact Us</a></li>\n" +
"        </ul>\n" +
"      </div>\n" +
"    </div>\n" +
"  </div>\n" +
"  <div id=\"middle_bo\">\n" +
"    <div class=\"middle_box_content\">\n" +
"	\n" +
"	<form action=\"signupaction.php\" method=\"post\" name=\"myform\" onsubmit=\"return validate()\">\n" +
"            <table class=\"register\" style=\"margin-left: 35px\">\n" +
"    \n" +
"                \n" +
"                <tr align=\"\" >\n" +
"        <br/>\n" +
" <h1>Enter your query.</h1>\n" +
" <td ><textarea cols=\"60\" rows=\"4\"> </textarea></td></tr>\n" +
"                \n" +
"                <tr>\n" +
"                    <td><h1>Specialization:</h1>\n" +
"                    <select name=\"spe\"   > \n" +
"             <option value=\"cardiologist\">Cardiologist</option>\n" +
"            <option value=\"anesthesiologist\">Anesthesiologist</option>\n" +
"            <option value=\"neurologist\">Neurologist</option>\n" +
"            <option value=\"psychiatrist\">Psychiatrist</option>\n" +
"            <option value=\"ent\">E.N.T</option>\n" +
"             <option value=\"surgeon\">Surgeon</option>\n" +
"        </select> \n" +
"                    </td></tr>\n" +
"                    <tr>  <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n" +
"                            <input type=\"submit\"  name=\"\" value=\"submit\" >\n" +
"                        \n" +
"                            </input></td></tr>\n" +
"    \n" +
"                </tr>\n" +
"                \n" +
"                \n" +
"</table>\n" +
"</form>\n" +
"	\n" +
"	\n" +
"	\n" +
"	\n" +
"	\n" +
"	\n" +
"	\n" +
"	</div>\n" +
"  </div>\n" +
"  <div class=\"pattern_bg\">\n" +
"    <div class=\"pattern_box\">\n" +
"      <div class=\"pattern_box_icon\"><img src=\"images/icon1.png\" alt=\"\" width=\"70\" height=\"112\" /></div>\n" +
"      <div class=\"pattern_content\">\n" +
"        <h1>My <span class=\"blue\">Medicine</span></h1>\n" +
"        <p class=\"pat\"> can involve art, science, or both. It has existed for thousands of years, during most of which it was an art (an area of skill and knowledge)\n" +
"		that frequently had connections to the religious and philosophical beliefs of each culture.. </p>\n" +
"      </div>\n" +
"    </div>\n" +
"    <div class=\"pattern_box\">\n" +
"      <div class=\"pattern_box_icon\"><img src=\"images/icon2.png\" alt=\"\" width=\"70\" height=\"112\" /></div>\n" +
"      <div class=\"pattern_content\">\n" +
"        <h1>Search <span class=\"blue\"> Treatments</span></h1>\n" +
"        <p class=\"pat\">  may refer to:\n" +
"Health or well-being:\n" +
"Medical treatment i.e., medical case management\n" +
"Therapy for any impairment\n" +
"Pain management\n" +
"A particular process or intervention specified in the design of an experiment. </p>\n" +
"      </div>\n" +
"    </div>\n" +
"  </div>\n" +
"  <div id=\"main_content\">\n" +
"    <div class=\"box_content\">\n" +
"      <div class=\"box_title\">\n" +
"        <div class=\"title_icon\"><img src=\"images/mini_icon1.gif\" alt=\"\" /></div>\n" +
"        <h2>My <span class=\"dark_blue\">Events</span></h2>\n" +
"      </div>\n" +
"      <div class=\"box_text_content\"> <img src=\"images/calendar.gif\" alt=\"\" class=\"box_icon\" />\n" +
"        <div class=\"box_text\"> Get appointment. </div>\n" +
"        <a href=\"#/\" class=\"details\">+ details</a> </div>\n" +
"      <div class=\"box_text_content\"> <img src=\"images/calendar.gif\" alt=\"\" class=\"box_icon\" />\n" +
"        <div class=\"box_text\"> Visit Doctor. </div>\n" +
"        <a href=\"#/\" class=\"details\">+ details</a> </div>\n" +
"    </div>\n" +
"    <div class=\"box_content\">\n" +
"      <div class=\"box_title\">\n" +
"        <div class=\"title_icon\"><img src=\"images/mini_icon2.gif\" alt=\"\" /></div>\n" +
"        <h2>My <span class=\"dark_blue\"> Goals</span></h2>\n" +
"      </div>\n" +
"      <div class=\"box_text_content\"> <img src=\"images/checked.gif\" alt=\"\" class=\"box_icon\" />\n" +
"        <div class=\"box_text\"> Exercise Daily. </div>\n" +
"        <a href=\"#/\" class=\"details\">+ details</a> </div>\n" +
"      <div class=\"box_text_content\"> <img src=\"images/checked.gif\" alt=\"\" class=\"box_icon\" />\n" +
"        <div class=\"box_text\"> Follow the diet. </div>\n" +
"        <a href=\"#/\" class=\"details\">+ details</a> </div>\n" +
"    </div>\n" +
"    <div class=\"box_content\">\n" +
"      <div class=\"box_title\">\n" +
"        <div class=\"title_icon\"><img src=\"images/mini_icon3.gif\" alt=\"\" /></div>\n" +
"        <h2>My <span class=\"dark_blue\">Sleep</span></h2>\n" +
"      </div>\n" +
"      <div class=\"box_text_content\"> <img src=\"images/checked.gif\" alt=\"\" class=\"box_icon\" />\n" +
"        <div class=\"box_text\"> Sleep at least 7 hours a day. </div>\n" +
"        <a href=\"#/\" class=\"details\">+ details</a> </div>\n" +
"      <div class=\"box_text_content\"> <img src=\"images/checked.gif\" alt=\"\" class=\"box_icon\" />\n" +
"        <div class=\"box_text\"> Wake up early from bed. </div>\n" +
"        <a href=\"#/\" class=\"details\">+ details</a> </div>\n" +
"    </div>\n" +
"    <div class=\"clear\"></div>\n" +
"  </div>\n" +
"  <div id=\"footer\">\n" +
"    <div class=\"copyright\"> <img src=\"images/footer_logo.gif\" alt=\"\" /> </div>\n" +
"    <div class=\"center_footer\">&copy;  All Rights Reserved</div>\n" +
"    <div class=\"footer_links\"> <a href=\"www.facebook.com\"></a> </div>\n" +
"  </div>\n" +
"</div>\n" +
"</body>\n" +
"</html>\n" +
"");
            /*out.println("<head>");
            out.println("<title>Servlet Query</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Query at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");*/
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
