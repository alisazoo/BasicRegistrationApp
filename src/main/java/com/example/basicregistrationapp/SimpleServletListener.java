package com.example.basicregistrationapp;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.logging.Level;
import java.util.logging.Logger;

// @WebListener example
// https://www.javaguides.net/2019/02/weblistener-annotation-example.html

/*
 * Web application lifecycle listener
 */
@WebListener
public class SimpleServletListener implements ServletContextListener, ServletContextAttributeListener {

    static final Logger log = Logger.getLogger(String.valueOf(SimpleServletListener.class));

    public void contextInitialized(ServletContextListener sce){
        System.out.println("Context initialized");
        log.info("Context initialized");
    }

    public void contextDestroyed(ServletContextListener sce){
        System.out.println("Context destroyed");
        log.info("Context destroyed");
    }

    public void attributeAdded(ServletContextAttributeEvent event){
        log.log(Level.INFO, "Attribute {0} has been added, with value: {1}",
                new Object[]{
                        event.getName(), event.getValue()
                });
    }

    public void attributeRemoved(ServletContextAttributeEvent event){
        log.log(Level.INFO, "Attribute {0} has been removed", event.getName());
    }

    public void attributeReplaced(ServletContextAttributeEvent event){
        log.log(Level.INFO, "Attribute {0} has been replaced, with value of: {1}",
                new Object[]{
                        event.getName(), event.getValue()
                });
    }

}
