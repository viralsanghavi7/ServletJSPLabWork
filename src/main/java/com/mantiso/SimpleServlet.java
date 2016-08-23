package com.mantiso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by vsanghav on 8/22/2016.
 */

@WebServlet("/home")
public class SimpleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        if(name!=null) {
            resp.setContentType("text/xml");

            resp.getWriter().write("<name>Hello " + name + " </name>");
        }
        else
            resp.getWriter().write("Please enter name");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        if(name!=null && name!="")
            resp.getWriter().write("Hello " + name);
        else
            resp.sendRedirect("index.jsp");
    }
}
