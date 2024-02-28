package com.sapours.crud_operation.Student_CRUD_SpringMVC_Assignment.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


import com.sapours.crud_dao.StudentDao1;

@Configuration
@ComponentScan(basePackages="com.sapours.crud_operation.Student_CRUD_SpringMVC_Assignment")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter{

	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	@Bean
	StudentDao1 daoObject() {
		
		return new StudentDao1();
	}
	
	@Bean
	public DataSource dataSource() {
		
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    
	    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	    
	    dataSource.setUrl("jdbc:mysql://localhost:3306/database_student");
	    
	    dataSource.setUsername("root");
	    
	    dataSource.setPassword("root");
	    
	    return dataSource;
	    
	}
	@Bean
	public JdbcTemplate jdbcTemplate() {
	
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		
	    jdbcTemplate.setDataSource(dataSource());
	    
	    return jdbcTemplate;
	  }		
}
