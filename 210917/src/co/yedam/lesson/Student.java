package co.yedam.lesson;

/*
 * �л��̸�, ����ó, �л��ּ�
 */
public class Student {
	// �ʵ�
	private String studentname;
	private String phone;
	private String address;
	
	// ������
	public Student(String name, String phone, String address) {
		this.studentname = name;
		this.phone = phone;
		this.address = address;
	}
	
	public void setStudentName(String name) {
		this.studentname = name;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void address(String address) {
		this.address = address;
	}
	
	public String getStudentName() {
		return this.studentname;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public String getAddress() {
		return this.address;
	}
}
