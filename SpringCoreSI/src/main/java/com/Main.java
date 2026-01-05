package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("META-INF/beans.xml");
		Student student = applicationContext.getBean("stud",Student.class);
		System.out.println(student);
	}

}
//<property name="eid" value="1"></property>
//<property name="ename" value="vamsi"></property>
//<property name="salary" value="12222.32"></property>


//<property name="eid"><value>2</value></property>
//<property name="ename"><value>kumar</value></property>
//<property name="salary"><value>232323.44</value></property>

//<bean name="emp" class="com.Employee" p:eid="3" p:ename="lalith" p:salary="9876.55" />

//<bean id="stud" class="com.Student">
//<property name="name" value="vamsi"></property>
//<property name="skills">
//<list>
//<value>Java</value>
//<value>SpringBoot</value>
//</list>
//</property>
//</bean>

//<bean id="stud" class="com.Student">
//<property name="name" value="vamsi"></property>
//<property name="skills">
//<set>
//<value>Java</value>
//<value>SpringBoot</value>
//</set>
//</property>
//</bean>