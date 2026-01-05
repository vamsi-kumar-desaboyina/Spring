package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("META-INF/beans.xml");
		Employee employee = applicationContext.getBean("emp",Employee.class);
		System.out.println(employee);
	}

}

//<bean id="emp" class="com.Employee">
//<property name="eid" value="1"></property>
//<property name="address" ref="add"></property>
//</bean>
//<bean id="add" class="com.Address">
//<property name="area" value="Tenali"></property>
//<property name="pincode" value="123232"></property>


//<bean id="emp" class="com.Employee" autowire="byType">
//<property name="eid" value="1"></property>
//</bean>
//<bean id="add" class="com.Address">
//<property name="area" value="Tenali"></property>
//<property name="pincode" value="123232"></property>
//</bean>

//<bean id="emp" class="com.Employee" autowire="byName">
//<property name="eid" value="1"></property>
//</bean>
//<bean id="addres" class="com.Address">
//<property name="area" value="Tenali"></property>
//<property name="pincode" value="123232"></property>
//</bean>
//<bean id="address" class="com.Address">
//<property name="area" value="Guntur"></property>
//<property name="pincode" value="564788"></property>
//</bean>