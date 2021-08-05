package com.example.application.servletController;

import com.example.application.repository.BaseDao;
import com.example.application.repository.impl.UserDaoImpl;
import com.example.application.entity.User;
import com.example.application.role.Role;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(value = "/logInServlet")
public class LogInServlet extends HttpServlet {

    private BaseDao dao = new UserDaoImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String password = req.getParameter("password");
        String companyName = req.getParameter("companyName");

        try {
            User user = dao.getUser(companyName, password);

            if (user != null ) {
                HttpSession session = req.getSession();
                session.setAttribute("user", user);
                if (user.getRole().equals(Role.RESTAURANT)){
                    RequestDispatcher dispatcher = req.getRequestDispatcher("/authorizedUserRestaurant.jsp");
                    dispatcher.forward(req, resp);
                }
                else if (user.getRole().equals(Role.SUPPLIER)){

                    RequestDispatcher dispatcher = req.getRequestDispatcher("/authorizedUserSupplier.jsp");
                    dispatcher.forward(req, resp);
                }

            }
            else {
                RequestDispatcher dispatcher = req.getRequestDispatcher("/noAuthorizedUser.jsp");
                dispatcher.forward(req, resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

