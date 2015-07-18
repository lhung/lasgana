package com.lasgana.cx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by ch594u on 7/18/15.
 */
@Configuration
@ComponentScan(basePackages = "com.lasgana.cx")
@EnableWebMvc
public class MainConfig {

    /**
     * Resolves views selected for rendering by @Controllers to .jsp resources in the /WEB-INF/views directory
     */
    @Bean
    public InternalResourceViewResolver buildViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

//    @Bean
//    public TilesConfigurer buildTilesConfigurer() {
//        TilesConfigurer configurer = new TilesConfigurer();
//        configurer.setDefinitions("/WEB-INF/tiles-defs.xml");
//        return configurer;
//    }
}
