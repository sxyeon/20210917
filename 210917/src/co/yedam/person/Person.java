package co.yedam.person;
/*
 * 이름, 키, 몸무게, 혈액형, 나이
 */
public class Person {
	//필드
	private String name;
	private double height;
	private double weight;
	private String bloodtype;
	private int age;
	
	
	public Person(String name, double height, double weight, String bloodtype, int age) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.bloodtype = bloodtype;
		this.age = age;
	}
	
	
	
	public void showInfo() {
		System.out.println("이름: " + name + ", 키: " + height + ", 몸무게: " + height + "혈액형: " + bloodtype + "나이: " + age);
	}
	
	
	public void setname(String name) {
		this.name = name;
	}
	
	public void setheight(double height) {
		this.height = height;
	}
	
	public void setweight(double weight) {
		this.weight = weight;
	}
	
	public void setbloodtype(String bloodtype) {
		this.bloodtype = bloodtype;
	}
	
	public void setage(int age) {
		this.age = age;
	
	}
	
	public String getname() {
		return name;
	}
	
	public double height() {
		return height;
	}
	
	public double weight() {
		return weight;
	}
	
	public String bloodtyoe() {
		return bloodtype;
	}
	
	public int age() {
		return age;
	}
	
	

}
