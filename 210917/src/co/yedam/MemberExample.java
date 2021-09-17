package co.yedam;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member(); // id, 이름, 연락처 모두 지정 가능, null값을 아무값도 할당이 안 되어 있어서 값을 못 넣음. 그래서 새로운 공간 위해 new Member()
		m1.memberId = 10;
		m1.name = "박미림";
		m1.phone = "010-1111-2222";

		Member m2 = new Member(); // 여기서도 new로 새로운 공간 할당
		m2.memberId = 20;
		m2.name = "홍길동";
		m2.phone = "010-3333-4444";

		Member[] members = { m1, m2 };
		for (Member member : members) {
			System.out.println("아이디: " + member.memberId);
			System.out.println("이름: " + member.name);
			System.out.println("연락처: " + member.phone);
		}

//		m1 ==> members[0]
		m1.name = "김미림";
		members[0].phone = "010-5555-6666";
//		for (Member member : members) {
//			System.out.println("아이디: " + member.memberId);
//			System.out.println("이름: " + member.name);
//			System.out.println("연락처: " + member.phone);
		
		for (Member member : members) {
			member.showInfo();

		}

	}

}
