package com.francisco;

import com.francisco.model.FoodType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        name = "selectfoodservlet",
        urlPatterns = "/SelectFood"
)

public class SelectFoodServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String foodType = req.getParameter("Type");

        FoodService foodService = new FoodService();
        FoodType fp = FoodType.valueOf(foodType);

        List productBrands = foodService.getAvailableProducts(fp);

        req.setAttribute("products", productBrands);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);

    }
}
