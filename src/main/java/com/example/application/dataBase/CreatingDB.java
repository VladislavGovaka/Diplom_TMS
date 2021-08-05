package com.example.application.dataBase;

import com.example.application.connection.ConnectionToDB;

import java.sql.Statement;

public class CreatingDB {

    private static final String CREATE_TABLE = "create table accounts11 (id int primary key auto_increment, " +
            "companyName varchar(20), password varchar(20), email varchar (20), numberPhone varchar (10), role varchar(10))";
    private static final String CREATE_TABLE_PRODUCTS_RESTAURANT = "create table restaurantProducts (id int primary key auto_increment," +
            "itemName varchar(30), quantity double (5,2) )";
    private static final String CREATE_TABLE_PRODUCTS_SUPPLIER = "create table supplierProducts (id int primary key auto_increment," +
            "itemName varchar(30), quantity double (5,2), price double(5,2))";

    private ConnectionToDB connection = new ConnectionToDB();

    public void creatDB() {
        try (Statement statement = connection.getConnection().createStatement()) {
            statement.executeUpdate(CREATE_TABLE_PRODUCTS_RESTAURANT);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

