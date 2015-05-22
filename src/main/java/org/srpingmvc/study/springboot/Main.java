package org.srpingmvc.study.springboot;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.MultipartConfigFactory;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Configuration//配置控制
@EnableAutoConfiguration
@ComponentScan//组件扫描
public class Main extends SpringBootServletInitializer  {
	
	
	public MultipartConfigElement multipartConfigElement()  {
		MultipartConfigFactory factory = new MultipartConfigFactory();
		factory.setMaxFileSize("128KB");
        factory.setMaxRequestSize("128KB");
        return factory.createMultipartConfig();
	}
	
    @Override
    protected SpringApplicationBuilder configure(
            final SpringApplicationBuilder application) {
        return application
                .sources(Main.class);
    }
	
    @Bean
    CommonsMultipartResolver multipartResolver(){
        return new CommonsMultipartResolver();
    }
	
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}