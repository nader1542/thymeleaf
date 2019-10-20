package com.example.thymleaf_tuto;

public class Employee {
	private String id;
	private String name;
	private String age;

	/**
	 * 
	 */
	public Employee() {
		super();
	}

	/**
	 * @param id
	 * @param name
	 * @param age
	 */
	public Employee(String id, String name, String age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}
}
