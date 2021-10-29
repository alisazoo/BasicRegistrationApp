//package com.example.basicregistrationapp;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.annotation.WebInitParam;
//import java.io.IOException;
//import java.util.Date;
//
//@WebFilter(
//        urlPatterns = {
//                "/*"
//        },
//        initParams = {
//                @WebInitParam(name = "username", value = "Arisa"),
//                @WebInitParam(name = "password", value = "pasS@123")
//        })
//public class AuthFilter implements Filter {
//
//    @Override
//    public void init(FilterConfig config) throws ServletException {
////        Filter.super.init(filterConfig);
//        // Get init parameter
//        String username = config.getInitParameter("username");
//        String password = config.getInitParameter("password");
//        // Print the init parameter
//        System.out.println("===================== AuthFilter.init() =====================");
//        System.out.println("User: " + username);
//        System.out.println("PW: " + password);
//    }
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//            throws IOException, ServletException {
//        // Log the current timestamp
//        System.out.println("===================== AuthFilter.doFilter() =====================");
//        System.out.println("Time " + new Date().toString());
//        // Pass request back down the filter chain
//        chain.doFilter(request, response);
//    }
//
//    @Override
//    public void destroy() {
////        Filter.super.destroy();
//        // Called before the Filter instance is removed from service by the web container.
//    }
//}
