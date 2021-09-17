package co.yedam.lesson;

/*
 * 이름, 과목
 */

public class teacher {
	// 필드 .. 보통은 필드를 private으로 막아두고 메소드를 열어준다
	private String name;
	private String major;
	
	// 생성자
	// teacher t1 new teacher(); => teacher의 값을 저장해주기 위해 공간을 만드는데 이걸 인스턴스를 생성한다고 함
	public teacher(String name, String major) {
		this.name = name; // name, major은 필드
		this.major = major;
	}
	
	// 메소드
	public void setname(String name) {
		this.name = name; // 필드값을 바꾸고 싶을 수 있으니까
		
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getMajor() {
		return this.major;
	}

}
