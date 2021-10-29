package com.example.basicregistrationapp.registration.dao;

import com.example.basicregistrationapp.registration.model.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/EmployeeDao")
public class EmployeeDao extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String address = req.getParameter("address");
        String contact = req.getParameter("contact");

        System.out.println(firstName + " " + lastName + " / " +
                username + " : " + password + " / " +
                address + " & " + contact);

        Employee newPerson = new Employee(firstName, lastName, username, password, address, contact);
        EmployeeDao dao = new EmployeeDao();
        try {
            dao.registerEmployee(newPerson);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int registerEmployee(Employee employee) throws ClassNotFoundException, SQLException {
        String INSERT_USERS_SQL = "INSERT INTO employee" +
                "(first_name, last_name, username, password, address, contact)" +
                "VALUES (?, ?, ?, ?, ?, ? );";
        int result = 0;

        String url = "jdbc:postgresql://localhost:5432/crud";
        String user = "postgres";
        String pw = "azoo";

        Class.forName("org.postgresql.Driver");

        try(Connection connection = DriverManager.getConnection(url, user, pw);
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)
        ){
            System.out.println("Connected");
            preparedStatement.setString(1, employee.getFirstname());
            preparedStatement.setString(2, employee.getLastname());
            preparedStatement.setString(3, employee.getUsername());
            preparedStatement.setString(4, employee.getPassword());
            preparedStatement.setString(5, employee.getAddress());
            preparedStatement.setString(6, employee.getContact());

            System.out.println(preparedStatement);
            result = preparedStatement.executeUpdate();

        } catch(SQLException e){
            e.printStackTrace();
        }

        return result;

    }

}
