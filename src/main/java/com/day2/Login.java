package com.day2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by vsanghav on 8/23/2016.
 */

@WebServlet("/login")
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();

        String username = req.getParameter("username");
        String pass = req.getParameter("password");

        if(username.equals("usainbolt") && pass.equals("goldmedal")) {
            Cookie cookie = new Cookie("username", username);
            resp.addCookie(cookie);

            RequestDispatcher rd = req.getRequestDispatcher("/welcome");
            rd.forward(req, resp);
        }else {
            resp.setContentType("text/html");
            writer.write("Bad Login\n");
            writer.write("<a href='login.jsp'>Click here to Login again</a>");
        }

    }
}
