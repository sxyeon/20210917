package co.yedam.member;

public class Member {
	// user1(아이디), 홍길동(이름), 대구 중구 남일동(주소)
	private String memberId;  // public은 member클래스 외에 다른 클래스에서 쓸 수 있도록 오픈되어있다는 의미 private은 member클래스 말고 다른 클래스에서는 사용하지 못하도록 숨긴더눈 의미
    private String name;
	private String address;
	
	// 생성자 : 필드에 값을 초기화
	public Member() {
		
	}
	
	public Member(String mId) {
		memberId = mId;
	}
	
	public Member(String mId, String n, String a) {
		memberId = mId;
		name = n;
		address = a;
	}
	
	public void setMemberId(String mId) {
		memberId = mId;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setAddress(String a) {
		address = a;
	}
	
	public String getMemberId() {
		return memberId; // 반환해주는 필드 : 아이디
	}
	
	public String getName() {
		return name; // 반환해주는 필드 : 이름
	}
	
	public String getAddress() {
		return address; // 반환해주는 필드 : 주소
	}
	
	// 메소드
	public void showInfo() {
		System.out.println("아이디: " + memberId + ", 이름: " + name + ", 주소: " + address);
	}
	
	public void showMemberId() {
		System.out.println("아이디: " + memberId);
	}
	
	public void showName() {
		System.out.println("이름: " + name);
	}
	
	public void showAddress() {
		System.out.println("주소: " + address);
	}

}
