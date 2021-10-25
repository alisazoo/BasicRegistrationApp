package com.example.basicregistrationapp;


import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorld", initParams = {
        @WebInitParam(name = "username", value = "Ramesh"),
        @WebInitParam(name = "password", value = "Pass@123")
}, urlPatterns = "/hello")
public class HelloWorldServlet extends GenericServlet {
    private static final long serialVersionUID = 1L;

    public void service(ServletRequest req, ServletResponse res)
            throws ServletException, IOException{
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.print("<html><body>");
        pw.print("<h1>Hello World GenericServlet Class Example</h1>");
        pw.print("<p> Servlet name:: " + getInitParameter("username") + "</p>");
        pw.print("<p> Servlet password:: " + getInitParameter("password") + "</p>");
        pw.print("<a href=\"http://www.javaguides.net\">Java Guides</a>");
        pw.print("</body></html>");
        pw.close();
    }
}
