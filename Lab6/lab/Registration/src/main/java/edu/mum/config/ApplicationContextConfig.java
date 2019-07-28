package edu.mum.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan("edu.mum")
@EnableWebMvc
public class ApplicationContextConfig implements WebMvcConfigurer {

    @Autowired
    private RequestMappingHandlerAdapter requestMappingHandlerAdapter;

//    @Autowired
//    private PhoneFormatter phoneFormatter;

    @PostConstruct
    public void init() {
        requestMappingHandlerAdapter.setIgnoreDefaultModelOnRedirect(true);
    }

    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    @Override
    public Validator getValidator() {
        return validator();
    }

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource resource = new ResourceBundleMessageSource();
        resource.setBasename("errorMessages");
        return resource;
    }

    @Bean(name = "validator")
    public LocalValidatorFactoryBean validator() {
        LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
        bean.setValidationMessageSource(messageSource());
        bean.getValidationPropertyMap().put("hibernate.validator.fail_fast", "false");
        return bean;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**")
                .addResourceLocations("/resources/");
    }

//    @Override
//    public void addFormatters(FormatterRegistry registry) {
//        registry.addFormatter(phoneFormatter);
//    }
}
