package com.spring.ex01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class PersonTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("person.xml"));
		PersonService person = (PersonService) factory.getBean("personServiceImpl");
		
		/*PersonService person = new PersonServiceImpl();
		person.setName("È«±æµ¿");*/
		
		/*PersonServiceImpl person = new PersonServiceImpl();
		person.setName("È«±æµ¿");*/
		
		person.sayHello();
		
		/*System.out.println("ÀÌ¸§: È«±æµ¿");
		System.out.println("³ªÀÌ: 0");
		Person person = new person();
		PersonService person = new PersonService();
		person.sayHello("È«±æµ¿", 0);*/
	}
	
}

/*class Person{
	
	public void sayHello(String name, int age) {
		System.out.println("ÀÌ¸§: " + name);
		System.out.println("³ªÀÌ: " + age);
	}
	
}*/
