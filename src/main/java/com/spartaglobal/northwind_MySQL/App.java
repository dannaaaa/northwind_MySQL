package com.spartaglobal.northwind_MySQL;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        NorthwindDAO northwindDAO = new NorthwindDAO();
        northwindDAO.iterateThroughEmployees();
    }
}
