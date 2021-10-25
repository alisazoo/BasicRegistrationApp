package com.example.basicregistrationapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
    private static final long SerialVersioinUID = 1L;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException{
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String emailId = req.getParameter("emailId");
        String password = req.getParameter("password");

        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        pw.print("<html><body>");
        pw.print("<h1>Student Registration from Data</h1>");
        pw.print("<p>firstName:: " + firstName + "</p>");
        pw.print("<p>lastName:: " + lastName + "</p>");
        pw.print("<p>Email ID:: " + emailId + "</p>");
        pw.print("<p>password:: " + password + "</p>");
        pw.print("</body></html>");
        pw.close();

        System.out.println("firstName:: " + firstName);
        System.out.println("lastName:: " + lastName);
        System.out.println("Email ID:: " + emailId);
        System.out.println("password:: " + password);
    }



}
