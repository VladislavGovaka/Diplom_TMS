package com.example.application.repository;

import com.example.application.entity.Item;
import com.example.application.entity.User;

import java.util.List;

public interface BaseDao {
    void addUser(User user);

    void addItem(Item item);

    List<Item> getAllItems(int id);
    List<Item> allOffers(int id);
    List<Item> getAllItems();
    Item getItem(int id);
    void setPrice(Item item);
    void deleteItem(int id);

    User getUser(String companyName, String password);
}
