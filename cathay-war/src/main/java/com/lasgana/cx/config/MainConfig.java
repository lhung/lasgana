package com.lasgana.cx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

/**
 * Created by ch594u on 7/18/15.
 */
@Configuration
@ComponentScan(basePackages = "com.lasgana.cx")
@EnableWebMvc
public class MainConfig {

    @Bean
    public ServletContextTemplateResolver buildTemplateResolver() {
        ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver();
        templateResolver.setPrefix("/WEB-INF/view/");
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode("HTML5");
        templateResolver.setCacheable(true);
        return templateResolver;
    }

    @Bean
    public SpringTemplateEngine buildTemplateEngine() {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(buildTemplateResolver());
        return templateEngine;
    }

    @Bean
    public ThymeleafViewResolver buildViewResolver() {
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(buildTemplateEngine());
        viewResolver.setOrder(1);
        viewResolver.setViewNames(new String[]{"thymeleaf/*"});
        return viewResolver;
    }
}