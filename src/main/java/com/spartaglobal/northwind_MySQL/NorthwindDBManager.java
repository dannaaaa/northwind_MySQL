package com.spartaglobal.northwind_MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NorthwindDBManager {

    private PropertiesManager props = new PropertiesManager();
    private final String CONNECTIONURL = "jdbc:mysql://localhost:3306/northwind?user=" + props.getUsername() +  "&password=" + props.getPassword() + "&serverTimezone=UTC";

    public Connection northwindConnection() throws SQLException{
        return DriverManager.getConnection(CONNECTIONURL);
    }

}
