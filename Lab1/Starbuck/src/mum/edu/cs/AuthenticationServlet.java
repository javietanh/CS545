package mum.edu.cs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mum.edu.data.*;

/**
 * Servlet implementation class AuthenticationServlet
 */
@WebServlet("/AuthenticationServlet")
public class AuthenticationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthenticationServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ServletContext ctx = request.getServletContext();

        String name = request.getParameter("name");
        String password = request.getParameter("password");

        DataFacade data = (DataFacade) getServletContext().getAttribute("dataSource");
        String expectedPassword = data.findPassword(name);

        if (expectedPassword == null || !expectedPassword.equals(password)) {
            request.setAttribute("error", "Name or Password is incorrect!");
            request.getRequestDispatcher("/index.jsp")
                    .forward(request, response);
        } else {
            request.getSession().setAttribute("isAuthenticated", true);
            response.sendRedirect(request.getContextPath() + "/AdviceServlet");
        }
    }

}
