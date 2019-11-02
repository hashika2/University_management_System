package com.connector;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector implements Connector {


    Connection con ;
    public Connection connect() throws ClassNotFoundException, SQLException {


            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");


        return con;
    }



        }



