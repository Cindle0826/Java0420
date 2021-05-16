package SourcePackage.com.myjava.ocp.lab25;

import java.io.Serializable;

public class Employee implements Serializable {
	public static final long serialVersionUID = 3L; // 版次
	private String name;
	private int salary;
	private  transient int age; //針對敏感性資料可以加入transient

	public Employee() {

	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	public Employee(String name, Integer salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
