package co.yedam.friend;

public class Friend {
	
	private String name;
	private String phone;
	private String email;
	private double height;
	private double weight;
	
	//
	
	public Friend() {
		
	}
	public Friend(String name, String phone, String email, double height, double weight) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.height = height;
		this.weight = weight;
	}
	
	//
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	public void showInfo() {
		System.out.println("[�̸�: " + name + ", ����ó: " + phone + ", �̸���: " + email + ", Ű: " + height + "������: " + weight);
	}
	
	
	
	

}
