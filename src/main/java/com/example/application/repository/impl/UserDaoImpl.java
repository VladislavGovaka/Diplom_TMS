package com.example.application.repository.impl;

import com.example.application.connection.ConnectionToDB;
import com.example.application.entity.Item;
import com.example.application.repository.BaseDao;
import com.example.application.entity.User;
import com.example.application.role.Role;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements BaseDao {

    private ConnectionToDB connection = new ConnectionToDB();
    private static final String ADD_USER = "insert into accounts (companyName, password, email, numberPhone, role ) values(?,?,?,?,?)";
    private static final String GET_USER = "select * from accounts where password = ? and companyName = ?";
    private static final String ADD_ITEM_RESTAURANT = "insert into restaurantproducts (itemName, quantity, user_id, company_name) values(?, ?, ?, ?)";
    private static final String GET_ALL_ITEMS_OF_RESTAURANT = "select itemName, quantity from restaurantproducts where user_id = ? ";
    private static final String GET_ALL_ITEMS_OF_RESTAURANT_FOR_SUPPLIER = "select * from restaurantproducts";
    private static final String GET_ITEM_BY_ID = "select *  from restaurantproducts where id = ? ";
    private static final String ADD_OFFER_PRICE = "insert into supplier_offers (item_Name, quantity,company_name, item_price, item_id, user_id) values(?, ?, ?, ?, ?,?)";
    private static final String GET_ALL_OFFERS = "select * from supplier_offers where user_id = ? ";
    private static final String DELETE_ITEM = "DELETE FROM restaurantproducts WHERE id = ?";
    @Override
    public void addUser(User user) {

        try (PreparedStatement preparedStatement = connection.getConnection().prepareStatement(ADD_USER)) {
            preparedStatement.setString(1, user.getCompanyName());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getNumberPhone());
            preparedStatement.setString(5, String.valueOf(user.getRole()));
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public User getUser(String companyName, String password) {

        try (PreparedStatement statement = connection.getConnection().prepareStatement(GET_USER)) {
            statement.setString(1, password);
            statement.setString(2, companyName);

            ResultSet resultSet = statement.executeQuery();
            User user = null;
            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String role = resultSet.getString("role");
                Role userRole = Role.valueOf(role);
                user = new User();
                user.setCompanyName(companyName);
                user.setPassword(password);
                user.setId(id);
                user.setRole(userRole);
                user.setEmail(resultSet.getString("email"));
                user.setNumberPhone(resultSet.getString("numberPhone"));


            }
            return user;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void addItem(Item item) {
        try (PreparedStatement statement = connection.getConnection().prepareStatement(ADD_ITEM_RESTAURANT)) {
            statement.setString(1, item.getName());
            statement.setDouble(2, item.getQuantity());
            statement.setInt(3, item.getUserId());
            statement.setString(4, item.getCompanyName());

            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Item> getAllItems(int id) {
        List<Item> itemList = new ArrayList<>();
        try (PreparedStatement statement = connection.getConnection().prepareStatement(GET_ALL_ITEMS_OF_RESTAURANT)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Item item = new Item();
                item.setName(resultSet.getString("itemName"));
                item.setQuantity(resultSet.getDouble("quantity"));

                itemList.add(item);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return itemList;
    }


    public List<Item> getAllItems() {
        List<Item> itemList = new ArrayList<>();
        try (PreparedStatement statement = connection.getConnection().prepareStatement(GET_ALL_ITEMS_OF_RESTAURANT_FOR_SUPPLIER)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Item item = new Item();
                item.setId(resultSet.getInt("id"));
                item.setName(resultSet.getString("itemName"));
                item.setQuantity(resultSet.getDouble("quantity"));
                item.setCompanyName(resultSet.getString("company_name"));
                itemList.add(item);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return itemList;
    }

    @Override
    public Item getItem(int id) {
        Item item = null;
        try (PreparedStatement statement = connection.getConnection().prepareStatement(GET_ITEM_BY_ID)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("itemName");
                double quantity = resultSet.getDouble("quantity");
                double price = resultSet.getDouble("item_price");
                int userId = resultSet.getInt("user_id");
                String companyName = resultSet.getString("company_name");
                item = new Item(id, name, quantity, price, userId, companyName);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return item;
    }

    @Override
    public void setPrice(Item item) {
        try (PreparedStatement statement = connection.getConnection().prepareStatement(ADD_OFFER_PRICE)) {
            statement.setString(1, item.getName());
            statement.setDouble(2, item.getQuantity());
            statement.setString(3, item.getCompanyName());
            statement.setDouble(4, item.getPrice());
            statement.setInt(5, item.getId());
            statement.setInt(6, item.getUserId());
            statement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Item> allOffers(int id) {
        List<Item> itemList = new ArrayList<>();
        try (PreparedStatement statement = connection.getConnection().prepareStatement(GET_ALL_OFFERS)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Item item = new Item();
                item.setId(resultSet.getInt("item_id"));
                item.setName(resultSet.getString("item_Name"));
                item.setQuantity(resultSet.getDouble("quantity"));
                item.setCompanyName(resultSet.getString("company_name"));
                item.setPrice(resultSet.getDouble("item_price"));

                itemList.add(item);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return itemList;
    }

    @Override
    public void deleteItem(int id) {
        try (PreparedStatement preparedStatement = connection.getConnection().prepareStatement(DELETE_ITEM)) {
            preparedStatement.setInt(1, id);
            boolean isDeleted = preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
