package com.day4;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vsanghav on 8/25/2016.
 */

@WebServlet("/olympics")
public class DataListing extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Country> countries = new ArrayList<>();
        countries.add(new Country("USA",121,46,37,38));
        countries.add(new Country("GB",67,27,23,38));
        countries.add(new Country("China",70,26,18,26));
        countries.add(new Country("Russia",42,17,10,15));

        ApplicationSettings applicationSettings = new ApplicationSettings(countries);

        RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/WEB-INF/data.jsp");
        req.setAttribute("data",applicationSettings);
        dispatcher.forward(req,resp);
    }
}
