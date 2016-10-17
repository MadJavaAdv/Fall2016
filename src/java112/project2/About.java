package java112.project2;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 *  This is part of a lab and is the first servlet for the course.
 *
 *@author    eknapp
 */
@WebServlet(
    name = "aboutServlet", 
    urlPatterns = { "/about" }
)
public class About extends HttpServlet {

    /**
     *  Handles HTTP GET requests.
     *
     *@param  request                   the HttpServletRequest object
     *@param  response                   the HttpServletResponse object
     *@exception  ServletException  if there is a Servlet failure
     *@exception  IOException       if there is an IO failure
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        // set the response type before sending data
        PrintWriter  out  = response.getWriter();
        out.print("<HTML>");
        out.print("<HEAD><TITLE>AboutServlet Output</TITLE></HEAD>");
        out.print("<BODY>");
        out.print("<h1>About Servlet Here!</h1>");
        System.out.println("Is this logging?");
        log("Is this logging?");
        out.print("</BODY>");
        out.print("</HTML>");
        out.close();
    }

}

