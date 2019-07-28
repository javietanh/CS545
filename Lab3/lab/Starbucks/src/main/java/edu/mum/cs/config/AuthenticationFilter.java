package edu.mum.cs.config;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthenticationFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        // cast ServletRequest to HttpServletRequest.
        HttpServletRequest request = (HttpServletRequest) servletRequest;

        // cast ServletResponse to HttpServletResponse.
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        // checking authorization code.
        boolean isAuthorized = request.getSession().getAttribute("isAuthenticated") != null ?
                (Boolean) request.getSession().getAttribute("isAuthenticated") :
                false;

        // get current servlet path.
        String url = request.getServletPath();

        // redirect to index in case unauthenticated.
        if (!isAuthorized && url.lastIndexOf("img") == -1) {
            response.sendRedirect("WEB-INF/view/login.jsp");
        }else{
            response.sendRedirect("WEB-INF/view/advice.jsp");
        }

        // other do filter.
        filterChain.doFilter(servletRequest, servletResponse);

    }
}
