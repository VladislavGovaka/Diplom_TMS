package com.example.application.servletController;

import com.example.application.repository.BaseDao;
import com.example.application.repository.impl.UserDaoImpl;
import com.example.application.role.Role;
import com.example.application.entity.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/addUser")
public class createAccountServlet extends HttpServlet {
    private BaseDao dao = new UserDaoImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String companyName = req.getParameter("companyName");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String phoneNumber = req.getParameter("phoneNumber");
        String roleParam = req.getParameter("role");
        Role role = Role.valueOf(roleParam);
        String reqPath = req.getContextPath();
        String pathFalse = reqPath + "/registerFalse.jsp";
        String pathTrue = reqPath + "/registerTrue.jsp";
        ServletContext context = getServletContext();
        RequestDispatcher dispatcher;
        if (companyName.isEmpty() || password.isEmpty() || email.isEmpty() || phoneNumber.isEmpty()) {
            dispatcher = context.getRequestDispatcher(pathFalse);
        } else {

            User user = new User();

            user.setCompanyName(companyName);
            user.setPassword(password);
            user.setEmail(email);
            user.setNumberPhone(phoneNumber);
            user.setRole(role);
            dao.addUser(user);
            dispatcher = context.getRequestDispatcher(pathTrue);
        }
        dispatcher.forward(req, resp);



    }
}