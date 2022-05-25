package com.spring.ex02;

public class PersonServiceImpl implements PersonService {
	
	private String name;
	private int age;

	/*public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}*/

	//public PersonServiceImpl() {;}
	
	public PersonServiceImpl(String name) {
		this.name = name;
	}

	public PersonServiceImpl(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public void sayHello() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age + "��");
	}
}
