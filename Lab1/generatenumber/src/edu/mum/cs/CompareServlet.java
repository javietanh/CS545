package edu.mum.cs;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "CompareServlet")
public class CompareServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random rd = new Random();
        int num1 = rd.nextInt(10);
        int num2 = rd.nextInt(10);
        int num3 = rd.nextInt(10);
        int numControl = rd.nextInt(10);
        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);
        request.setAttribute("num3", num3);
        request.setAttribute("numControl", numControl);
        request.getRequestDispatcher("/index.jsp")
                .forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
