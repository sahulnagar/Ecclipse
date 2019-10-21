package com.deepak.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages= {"com.deepak"})
//@EnableWebMvc
public class Config 
{
	public DataSource getDataSource()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("system");
		ds.setPassword("oracle");
		return ds;
	}
	@Bean
	public JdbcTemplate getTemplate()
	{
		return new JdbcTemplate(getDataSource());
	}

}
