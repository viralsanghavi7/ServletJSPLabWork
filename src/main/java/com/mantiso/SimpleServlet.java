package com.mantiso;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by vsanghav on 8/22/2016.
 */

@WebServlet("/home")
public class SimpleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
/*        String name = req.getParameter("name");
        if(name!=null) {
            resp.setContentType("text/xml");

            resp.getWriter().write("<name>Hello " + name + " </name>");
        }
        else
            resp.getWriter().write("Please enter name");*/


        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/hello.jsp");

        SimpleDateFormat formatter = new SimpleDateFormat("EEE");
        Calendar cal = Calendar.getInstance();formatter.format(cal.getTime());
        req.setAttribute("message", formatter.format(cal.getTime()));
        dispatcher.forward(req,resp);
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
