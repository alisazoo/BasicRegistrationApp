package com.example.basicregistrationapp;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

// http://localhost:8080/BasicRegistrationApp_war_exploded/ServletInterface
@WebServlet("/ServletInterface")
public class ServletImpl implements Servlet {

    private ServletConfig config = null;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        System.out.println("Inside init method: " + config.getServletName());
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("inside service method");
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.print("<html><body>");
        out.print("<p>Hello</p>");
        out.print("</body></html>");
    }

    @Override
    public String getServletInfo() {
        return "Demonstrated implementation of Servlet interface";
    }

    @Override
    public void destroy() {
        System.out.println("inside destroy method");
    }
}
