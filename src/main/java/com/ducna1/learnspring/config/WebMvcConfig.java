package com.ducna1.learnspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
// @EnableWebMvc: sử dụng để cấu hình cho việc sử dụng Spring MVC
// class WebMvcConfig implements WebMvcConfigurer: implements WebMvcConfigurer
// để
// cấu hình cho việc sử dụng Spring MVC
public class WebMvcConfig implements WebMvcConfigurer {
  @Bean
  public ViewResolver viewResolver() {
    final InternalResourceViewResolver bean = new InternalResourceViewResolver();
    bean.setViewClass(JstlView.class);
    bean.setPrefix("/WEB-INF/view/");
    bean.setSuffix(".jsp");
    return bean;
  }

  @Override
  public void configureViewResolvers(ViewResolverRegistry registry) {
    registry.viewResolver(viewResolver());
  }

  @Override // ghi đè lại phương thức addResourceHandlers để cấu hình cho việc tìm kiếm các
            // resource (css, js, images, etc...)
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/css/**").addResourceLocations("/resources/css/");
    registry.addResourceHandler("/js/**").addResourceLocations("/resources/js/");
    registry.addResourceHandler("/images/**").addResourceLocations("/resources/images/");
  }
}
