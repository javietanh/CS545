package mum.edu.config;

import mum.edu.formatter.CategoryFormatter;
import mum.edu.formatter.ISBNNumberFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * WebMvcConfigurerAdapter is deprecated
 * <p>
 * https://www.baeldung.com/web-mvc-configurer-adapter-deprecated
 */
@Configuration
@EnableWebMvc
@ComponentScan("mum.edu")
public class WebApplicationContextConfig implements WebMvcConfigurer {

    @Autowired
    CategoryFormatter categoryFormatter;

    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource resource = new ResourceBundleMessageSource();
        resource.setBasename("messages");
//        resource.setBasenames({});
        return resource;
    }


    @Override
    public void addFormatters(FormatterRegistry registry) {
//        registry.addFormatter(new CategoryFormatter());
        registry.addFormatter(categoryFormatter);
        registry.addFormatter(new ISBNNumberFormatter());
    }

}
