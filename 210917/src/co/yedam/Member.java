package co.yedam;

public class Member {
	// 필드(정보저장) - 어떤 정보를 저장하기 위한 용도
	int memberId;
	String name;
	String phone;
	
	
	// 메소드(기능) - 정보를 내보내거나 받아오는 기능
	public void showInfo() {
		System.out.println("아이디: " + memberId + ", 이름: " + name + ", 연락처: " + phone);
	}
	

}
