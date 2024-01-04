package com.ra.session01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DemoServlet",value = "/home")
public class DemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      // xử lý và điều hướng
        String fullName = "Nguyên Văn A";
        req.setAttribute("fullName",fullName);
        req.getRequestDispatcher("home.jsp").forward(req,resp);
    }
}
