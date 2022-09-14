package com.aayush.gulia.JDBC_sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchData{
    public static void main(String[] args) throws Exception{
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\grey.db");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM employe");
        // employeID, name, city, deptno

        int employeID, deptno; String name,city;

        while(resultSet.next()){
            employeID = resultSet.getInt("employeID");
            deptno = resultSet.getInt("deptno");
            name = resultSet.getString("name");
            city = resultSet.getString("city");
            System.out.println(employeID + " " + name + " " + city + " "  + deptno);
        }
        statement.close();
        connection.close();
    }
}
