package edu.mum.cs.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class DispatcherServlet extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{StarbucksConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

//    @Override
//    protected Filter[] getServletFilters() {
//        return new Filter[]{new AuthenticationFilter()};
//    }
}
