package com.spring.ex01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class PersonTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("person.xml"));
		PersonService person = (PersonService) factory.getBean("personServiceImpl");
		
		/*PersonService person = new PersonServiceImpl();
		person.setName("ȫ�浿");*/
		
		/*PersonServiceImpl person = new PersonServiceImpl();
		person.setName("ȫ�浿");*/
		
		person.sayHello();
		
		/*System.out.println("�̸�: ȫ�浿");
		System.out.println("����: 0");
		Person person = new person();
		PersonService person = new PersonService();
		person.sayHello("ȫ�浿", 0);*/
	}
	
}

/*class Person{
	
	public void sayHello(String name, int age) {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
	}
	
}*/
