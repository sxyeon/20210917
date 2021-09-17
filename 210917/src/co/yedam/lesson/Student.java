package co.yedam.lesson;

/*
 * 학생이름, 연락처, 학생주소
 */
public class Student {
	// 필드
	private String studentname;
	private String phone;
	private String address;
	
	// 생성자
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
