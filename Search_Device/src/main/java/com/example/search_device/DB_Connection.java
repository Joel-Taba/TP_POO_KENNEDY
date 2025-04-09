package com.example.search_device;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {
    private static final String URL="jdbc:mysql://localhost:3306/Laptop";
    private static final String USER="root";
    private static final String PASSWORD="-Robotique07";

    public static Connection getConnection() {
        Connection co=null;
        try{
            co=DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connexion établie!");
        }catch(SQLException e){
            System.out.println("Erreur de connexion "+ e.getMessage());

        }
        return co;
        }

    }
