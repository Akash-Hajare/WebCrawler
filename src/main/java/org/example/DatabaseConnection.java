package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    static Connection connection = null;

    public static Connection getConnection(){
        if(connection!=null){
            return connection;
        }
        String db = "sql6580766";
        String user = "sql6580766";
        String pwd = "ehDzbwWx6a";
        return getConnection(db, user, pwd);
    }
    private static Connection getConnection(String db, String user ,String pwd){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com/"+db+"?user="+user+"&password="+pwd);
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
        return connection;
    }
}


