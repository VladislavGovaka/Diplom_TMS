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

@WebServlet(value = "/offerPrice")
public class offerPrice extends HttpServlet {
    private BaseDao dao = new UserDaoImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id =req.getParameter("id");
        Item item = dao.getItem(Integer.parseInt(id));
        req.setAttribute("item", item);
        String price = req.getParameter("offer_price");
        HttpSession session = req.getSession();
        User user = (User)session.getAttribute("user");
        item.setPrice(Double.parseDouble(price));
        item.setCompanyName(user.getCompanyName());
        dao.setPrice(item);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/authorizedUserSupplier.jsp");
        dispatcher.forward(req, resp);
    }
}
