package com.example.application.servletController;

import com.example.application.entity.Item;
import com.example.application.entity.User;
import com.example.application.repository.BaseDao;
import com.example.application.repository.impl.UserDaoImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(value = "/addItemRestaurant")
public class AddItemRestaurant extends HttpServlet {

    BaseDao dao = new UserDaoImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String itemName = req.getParameter("itemName");
        String quantity = req.getParameter("quantity");
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        Item item = new Item();
        item.setName(itemName);
        item.setQuantity(Double.parseDouble(quantity));
        item.setUserId(user.getId());
        item.setCompanyName(user.getCompanyName());
        dao.addItem(item);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/authorizedUserRestaurant.jsp");
        dispatcher.forward(req, resp);
    }
}
