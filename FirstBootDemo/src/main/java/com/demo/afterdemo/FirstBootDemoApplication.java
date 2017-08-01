package com.demo.afterdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@SpringBootApplication (scanBasePackages={"com.controllers"})
public class FirstBootDemoApplication  extends WebMvcConfigurerAdapter {

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        registry.viewResolver(resolver);
    }
    /*
     * Replacement of above method is 
     * add two line in application.properties file
		spring.mvc.view.prefix=/WEB-INF/
		spring.mvc.view.suffix=.jsp
     * */
    /*
     What is the role of this line in application.properties 
     server.context-path=/firstboot
     without this line you application will run 
     http://localhost:3000/
     After adding this line in 
      http://localhost:3000/firstboot/
     */
	public static void main(String[] args) {
		SpringApplication.run(FirstBootDemoApplication.class, args);
	}
}
