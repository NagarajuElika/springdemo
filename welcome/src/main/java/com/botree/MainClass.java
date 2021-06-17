package com.botree;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.botree.appconfig.AppConfig;
import com.botree.dao.EmployeeDao;
import com.botree.pojo.Employee;

public class MainClass {
	public static void main(String args[]) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeDao empdao =(EmployeeDao)context.getBean("EmployeeDao");
        Employee emp=new Employee(1, "Nagaraju", 47000.0);
        empdao.save(emp);
	}
}
