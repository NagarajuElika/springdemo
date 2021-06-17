package com.botree.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.botree.pojo.Employee;

@Configuration
@ComponentScan({"com.botree.dao"})
public class EmployeeDao {
	 @Autowired
	    private SessionFactory sessionFactory;
	 @Bean
	 public void save(Employee Emp) {
		 sessionFactory.openSession().save(Emp);
	 }
}
