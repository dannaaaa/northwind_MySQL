package com.spartaglobal.northwind_MySQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NorthwindDAO {

    private NorthwindDBManager nwconn = new NorthwindDBManager();

    public void iterateThroughEmployees(){
        final String query = "SELECT * FROM Employees LIMIT 10";
        try (Statement stmt = nwconn.northwindConnection().createStatement()){
            ResultSet resultSet = stmt.executeQuery(query);
            while (resultSet.next()){
                System.out.println(resultSet.getString("first_name") + " " + resultSet.getString("last_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }





}
