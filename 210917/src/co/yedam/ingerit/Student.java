package co.yedam.ingerit;
/*
 * People 상속 Student
 */
public class Student extends People {
	private int studentNO;
	
	Student(String name, String ssn){
		super(name, ssn);
	}
	
	Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNO = studentNo;
	}
	
	public int getStudentNo() {
		return studentNo;
	}

	// Override	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Name: " + super.getName() + ", SSN: " + super.getSsn() + ",SNO: " + this.getStudentNo());
	}
	
	// Student -> People -> Object
	@Override
	public String toString() {
		return "학생 [이름" + this.getName() + "주민번호 " + this.getSsn() + "학번 " + this.getStudentNo() + "]";
		
	}
	
	
	
	

}
