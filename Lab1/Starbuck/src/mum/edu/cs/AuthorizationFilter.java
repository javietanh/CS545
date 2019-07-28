package mum.edu.cs;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "AuthorizationFilter")
public class AuthorizationFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        // cast ServletRequest to HttpServletRequest.
        HttpServletRequest request = (HttpServletRequest) req;

        // cast ServletResponse to HttpServletResponse.
        HttpServletResponse response = (HttpServletResponse) resp;

        // checking authorization code.
        boolean isAuthorized = request.getSession().getAttribute("isAuthenticated") != null ?
                (boolean)request.getSession().getAttribute("isAuthenticated") : false;

        // get current servlet path.
        String url = request.getServletPath();

        // redirect to index in case unauthenticated.
        if(!isAuthorized && !url.contains("index") && !url.contains("login")){
            response.sendRedirect("index.jsp");
        }

        // other do filter.
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
