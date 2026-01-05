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
//<property name="eid" value="1"></property>
//<property name="ename" value="vamsi"></property>
//<property name="salary" value="12222.32"></property>


//<property name="eid"><value>2</value></property>
//<property name="ename"><value>kumar</value></property>
//<property name="salary"><value>232323.44</value></property>

// <bean name="emp" class="com.Employee" p:eid="3" p:ename="lalith" p:salary="9876.55" />
