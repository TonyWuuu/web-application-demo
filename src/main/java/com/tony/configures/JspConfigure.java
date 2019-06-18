package com.tony.configures;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
public class JspConfigure {

    @Value("${spring.view.prefix}")
    private String prefix;
    @Value("${spring.view.suffix}")
    private String suffix;
    @Value("${spring.view.view-name}")
    private String viewNames;

    @Bean
    public InternalResourceViewResolver jspViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix(prefix);
        resolver.setSuffix(suffix);
        resolver.setViewNames(viewNames);
        resolver.setViewClass(JstlView.class);
        return resolver;
    }
}
