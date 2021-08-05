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
import java.util.List;

@WebServlet(value = "/getAllOffers")
public class GetAllOffers extends HttpServlet {
    private BaseDao dao = new UserDaoImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        List<Item> itemList = dao.allOffers(user.getId());
        req.setAttribute("ItemList", itemList);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/getAllOffers.jsp");
        dispatcher.forward(req, resp);

    }

}
